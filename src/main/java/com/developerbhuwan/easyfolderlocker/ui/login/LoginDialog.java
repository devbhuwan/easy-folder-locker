package com.developerbhuwan.easyfolderlocker.ui.login;



import com.developerbhuwan.easyfolderlocker.security.EncryptionAndDecryption;
import com.developerbhuwan.easyfolderlocker.ui.AppConstants;
import com.developerbhuwan.easyfolderlocker.ui.MainUI;
import java.awt.Color;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;


/**
 *
 * @author Bhuwan Upadhyay
 */
public class LoginDialog extends javax.swing.JDialog {

    private final MainUI mainUI;
    /**
     * Creates new form LoginDialog
     *
     * @param parent
     * @param modal
     */
    public LoginDialog(MainUI parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.mainUI = parent;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        passwdField = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setOpacity(.9f);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Password :");

        passwdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

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

        errorMessage.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(passwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelButton))
                    .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, okButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        hoverButton(cancelButton);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setOpaque(false);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void okButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseEntered
        hoverButton(okButton);
    }//GEN-LAST:event_okButtonMouseEntered

    private void okButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseExited
        okButton.setOpaque(false);
    }//GEN-LAST:event_okButtonMouseExited

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        try {
            String password = passwdField.getText().trim();
            String envDirectory = System.getenv("ProgramFiles");
            Path passDirectory = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_LOG_PATH, "bnsecurity.bn");
            byte[] textEncrypted = Files.readAllBytes(passDirectory);
            String originalPassword = EncryptionAndDecryption.decrypt(textEncrypted);
            if (originalPassword.equals(password)) {
                this.setVisible(false);
                this.dispose();
                mainUI.addLockList();
            } else {
                errorMessage.setText("Password does not match.");
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    private javax.swing.JPasswordField passwdField;
    // End of variables declaration//GEN-END:variables

    private void hoverButton(JButton btn) {
        btn.setBackground(Color.BLACK);
        btn.setOpaque(true);
    }
}
