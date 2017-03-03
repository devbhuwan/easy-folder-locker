package com.developerbhuwan.easyfolderlocker.ui.lock.file;



import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhuwan Upadhyay
 */
public class TableUtils {

    public void addingTableRow(JTable itemTable) {
        DefaultTableModel model = (DefaultTableModel) itemTable.getModel();
        Object[] data = {null, null, null};
        model.addRow(data);
        itemTable.setModel(model);
    }
}
