package com.developerbhuwan.easyfolderlocker.ui.lock.file;


import com.developerbhuwan.easyfolderlocker.ui.AppConstants;
import com.developerbhuwan.easyfolderlocker.ui.MainUI;
import java.awt.Color;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;

/**
 *
 * @author Bhuwan Upadhyay
 */
public class LockedFileDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutDialog
     *
     * @param parent
     * @param modal
     */
    public LockedFileDialog(MainUI parent, boolean modal) {
        super(parent, modal);
        initComponents();
        new TableUI().getTableHeaderUI(fileListTable);
        fileListTable.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(lock));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lock = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        finishButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        fileListTable = new javax.swing.JTable();
        totalCounter = new javax.swing.JLabel();

        lock.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        lock.setForeground(new java.awt.Color(255, 255, 255));
        lock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));
        lock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 50));
        lock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lock.setFocusable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(.9f);

        jPanel3.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setOpaque(true);

        cancelButton.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Back");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cancelButton.setContentAreaFilled(false);
        cancelButton.setFocusPainted(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        finishButton.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        finishButton.setForeground(new java.awt.Color(255, 255, 255));
        finishButton.setText("Finish");
        finishButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        finishButton.setContentAreaFilled(false);
        finishButton.setFocusPainted(false);
        finishButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finishButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finishButtonMouseExited(evt);
            }
        });
        finishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });

        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        fileListTable.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        fileListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folder Description", "Lock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        fileListTable.setFocusable(false);
        fileListTable.setGridColor(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        fileListTable.setRowHeight(30);
        fileListTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        fileListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        fileListTable.setShowVerticalLines(false);
        fileListTable.getTableHeader().setReorderingAllowed(false);
        scrollPane.setViewportView(fileListTable);
        if (fileListTable.getColumnModel().getColumnCount() > 0) {
            fileListTable.getColumnModel().getColumn(0).setPreferredWidth(800);
            fileListTable.getColumnModel().getColumn(1).setResizable(false);
            fileListTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        totalCounter.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        totalCounter.setForeground(new java.awt.Color(255, 255, 255));
        totalCounter.setText("Total Folders : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(finishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(totalCounter, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {finishButton, totalCounter});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        hoverButton(cancelButton);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setOpaque(false);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void finishButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishButtonMouseEntered
        hoverButton(finishButton);
    }//GEN-LAST:event_finishButtonMouseEntered

    private void finishButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishButtonMouseExited
        finishButton.setOpaque(false);
    }//GEN-LAST:event_finishButtonMouseExited

    private void finishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        try {
            Charset charset = Charset.forName("UTF-8");
            String envDirectory = System.getenv("ProgramFiles");
            Path fileLogDirectory = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_LOG_PATH, "file_info.bn");
            for (int i = 0; i < fileListTable.getRowCount(); i++) {
                if (fileListTable.getModel().getValueAt(i, 1).toString().equalsIgnoreCase("No")) {
                    Path path = FileSystems.getDefault().getPath(fileListTable.getModel().getValueAt(i, 0).toString());
                    String hideCommand = "attrib -s -h " + "\"" + path + "\"";
                    Runtime r = Runtime.getRuntime();
                    Process p = r.exec(hideCommand);
                    String username = System.getProperty("user.name");
                    UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(username);
                    AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
                    AclEntry entry = AclEntry.newBuilder().setType(AclEntryType.ALLOW).
                            setPrincipal(user).setPermissions(AclEntryPermission.ADD_FILE,
                                    AclEntryPermission.ADD_SUBDIRECTORY, AclEntryPermission.APPEND_DATA, AclEntryPermission.DELETE, AclEntryPermission.DELETE_CHILD, AclEntryPermission.EXECUTE, AclEntryPermission.LIST_DIRECTORY,
                                    AclEntryPermission.READ_ACL, AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA,
                                    AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.SYNCHRONIZE, AclEntryPermission.WRITE_ACL,
                                    AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.WRITE_DATA, AclEntryPermission.WRITE_NAMED_ATTRS,
                                    AclEntryPermission.WRITE_OWNER).build();
                    List<AclEntry> acl = view.getAcl();
                    acl.add(0, entry);
                    view.setAcl(acl);
                }
            }
            Files.deleteIfExists(fileLogDirectory);
            if (!Files.exists(fileLogDirectory)) {
                Files.createFile(fileLogDirectory);
            }
            ArrayList<String> lines = new ArrayList<>();
            for (int i = 0; i < fileListTable.getRowCount(); i++) {
                if (fileListTable.getModel().getValueAt(i, 1).toString().equalsIgnoreCase("Yes")) {
                    lines.add(fileListTable.getModel().getValueAt(i, 0).toString());
                }
            }
            Files.write(fileLogDirectory, lines, charset, StandardOpenOption.APPEND);
            List<String> prevLines = Files.readAllLines(fileLogDirectory, charset);
            for (String s : prevLines) {
                Path path = FileSystems.getDefault().getPath(s);
                String username = System.getProperty("user.name");
                UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName(username);
                AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
                AclEntry entry = AclEntry.newBuilder().setType(AclEntryType.DENY).
                        setPrincipal(user).setPermissions(AclEntryPermission.ADD_FILE,
                                AclEntryPermission.ADD_SUBDIRECTORY, AclEntryPermission.APPEND_DATA, AclEntryPermission.DELETE, AclEntryPermission.DELETE_CHILD, AclEntryPermission.EXECUTE, AclEntryPermission.LIST_DIRECTORY,
                                AclEntryPermission.READ_ACL, AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA,
                                AclEntryPermission.READ_NAMED_ATTRS, AclEntryPermission.SYNCHRONIZE, AclEntryPermission.WRITE_ACL,
                                AclEntryPermission.WRITE_ATTRIBUTES, AclEntryPermission.WRITE_DATA, AclEntryPermission.WRITE_NAMED_ATTRS,
                                AclEntryPermission.WRITE_OWNER).build();
                List<AclEntry> acl = view.getAcl();
                acl.add(0, entry);
                view.setAcl(acl);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        cancelButtonActionPerformed(evt);
    }//GEN-LAST:event_finishButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable fileListTable;
    private javax.swing.JButton finishButton;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox lock;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel totalCounter;
    // End of variables declaration//GEN-END:variables

    private void hoverButton(JButton btn) {
        btn.setBackground(Color.BLACK.brighter());
        btn.setOpaque(true);
    }

    public void fetchLockedFileList() {
        try {
            Charset charset = Charset.forName("UTF-8");
            String envDirectory = System.getenv("ProgramFiles");
            Path fileLogDirectory = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_LOG_PATH, "file_info.bn");
            if (!Files.exists(fileLogDirectory)) {
                Files.createFile(fileLogDirectory);
            }
            List<String> prevLines = Files.readAllLines(fileLogDirectory, charset);
            int count = 0;
            for (String s : prevLines) {
                new TableUtils().addingTableRow(fileListTable);
                fileListTable.getModel().setValueAt(s, count, 0);
                fileListTable.getModel().setValueAt("Yes", count, 1);
                count++;
            }
            totalCounter.setText("Total Folders : " + count);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
