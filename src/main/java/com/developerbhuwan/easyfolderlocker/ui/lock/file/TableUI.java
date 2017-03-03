package com.developerbhuwan.easyfolderlocker.ui.lock.file;



import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Bhuwan Upadhyay
 */
public class TableUI {
    
    public JTableHeader getTableHeaderUI(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setOpaque(false);
        header.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        header.setForeground(Color.white);
        header.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground")));
        return header;
    }
    
    public JTableHeader getTableListHeaderUI(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setOpaque(false);
        header.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        header.setForeground(Color.white);
        header.setBackground(java.awt.SystemColor.yellow.darker());//javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground")));
        return header;
    }
}
