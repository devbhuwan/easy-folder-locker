package com.developerbhuwan.easyfolderlocker.ui;

import com.developerbhuwan.easyfolderlocker.security.EncryptionAndDecryption;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhuwan Upadhyay
 */
public class CustomDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChangePassword
     *
     * @param parent
     * @param modal
     */
    public CustomDialog(MainUI parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        messageTextArea = new javax.swing.JTextArea();
        headerPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(.9f);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        okButton.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("Ok");
        okButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        okButton.setContentAreaFilled(false);
        okButton.setFocusPainted(false);
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okButtonMouseExited(evt);
            }
        });
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
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

        messageTextArea.setEditable(false);
        messageTextArea.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        messageTextArea.setColumns(20);
        messageTextArea.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        messageTextArea.setForeground(new java.awt.Color(255, 255, 255));
        messageTextArea.setRows(5);
        messageTextArea.setBorder(null);
        messageTextArea.setPreferredSize(new java.awt.Dimension(220, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messageTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        headerPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        headerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"), javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground")));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });

        closeButton.setIcon(new ImageIcon(getClass().getResource("/images/close.png")));
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setFocusPainted(false);
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setIcon(new ImageIcon(getClass().getResource("/images/logo.png")));
        titleLabel.setIconTextGap(10);

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(closeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseEntered
        hoverButton(okButton);
    }//GEN-LAST:event_okButtonMouseEntered

    private void okButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseExited
        okButton.setOpaque(false);
    }//GEN-LAST:event_okButtonMouseExited

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (titleLabel.getText() != null) {
            if (titleLabel.getText().equalsIgnoreCase("exit")) {
                System.exit(0);
            }
        }

    }//GEN-LAST:event_okButtonActionPerformed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        this.setLocation(evt.getXOnScreen() - this.getSize().width / 2, evt.getYOnScreen() - headerPanel.getSize().height / 2);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        hoverButton(cancelButton);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setOpaque(false);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButton.setOpaque(false);
    }//GEN-LAST:event_closeButtonMouseExited

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        hoverButton(closeButton);
    }//GEN-LAST:event_closeButtonMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void hoverButton(JButton btn) {
        btn.setBackground(Color.BLACK);
        btn.setOpaque(true);
    }
    
    public void setTitleLabelText(String title) {
        titleLabel.setText(title);
    }
    
    public void setMessages(String msg) {
        messageTextArea.setText(msg);
    }
}
