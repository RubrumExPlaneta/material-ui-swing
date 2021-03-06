package mdlaf.tree;

import mdlaf.MaterialFonts;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;

public class MaterialTreeUI extends BasicTreeUI {

	public static ComponentUI createUI (final JComponent c) {
		return new MaterialTreeUI ();
	}

	@Override
	public void installUI (JComponent c) {
		super.installUI (c);
		JTree tree = (JTree) c;

		DefaultTreeCellRenderer renderer = new MaterialTreeCellRenderer ();
		TreeCellEditor editor = new MaterialTreeCellEditor (tree, renderer);

		tree.setCellRenderer (renderer);
		tree.setCellEditor (editor);

		tree.setFont (MaterialFonts.REGULAR);
		tree.setRowHeight (0);
		tree.setInvokesStopCellEditing (true);

		MaterialTreeUI ui = (MaterialTreeUI) tree.getUI ();
		ui.setLeftChildIndent (10);
		ui.setRightChildIndent (10);
	}
}