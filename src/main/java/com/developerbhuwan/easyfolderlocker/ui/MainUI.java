package com.developerbhuwan.easyfolderlocker.ui;

import com.developerbhuwan.easyfolderlocker.ui.about.AboutDialog;
import com.developerbhuwan.easyfolderlocker.ui.changePasswd.ChangePasswordDialog;
import com.developerbhuwan.easyfolderlocker.ui.changePasswd.CreateNewPasswordDialog;
import com.developerbhuwan.easyfolderlocker.ui.lock.file.LockedFileDialog;
import com.developerbhuwan.easyfolderlocker.ui.login.LoginDialog;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhuwan Upadhyay
 */
public class MainUI extends javax.swing.JFrame {

    private LoginDialog loginDialog;
    private ChangePasswordDialog changePasswordDialog;
    private AboutDialog abountDialog;
    private CreateNewPasswordDialog createNewPasswordDialog;
    private LockedFileDialog lockedFileDialog;

    public MainUI() {
        loadLookAndFeels();
        initComponents();
        addLabelAndButton(addButton, addLabel);
        addLabelAndButton(openButton, openLabel);
        addLabelAndButton(passwordButton, passwordLabel);
        addLabelAndButton(aboutButton, aboutLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        passwordButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        folderChooser = new javax.swing.JFileChooser();
        headerPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        chanageThemeButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        openLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        leftLabel = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        midLabel = new javax.swing.JLabel();

        openButton.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        openButton.setForeground(new java.awt.Color(255, 255, 255));
        openButton.setText("Open Locked Folder");
        openButton.setBorderPainted(false);
        openButton.setContentAreaFilled(false);
        openButton.setFocusPainted(false);
        openButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                openButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                openButtonMouseExited(evt);
            }
        });
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add New Folder");
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setFocusPainted(false);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        passwordButton.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        passwordButton.setForeground(new java.awt.Color(255, 255, 255));
        passwordButton.setText("Change Pasword");
        passwordButton.setBorderPainted(false);
        passwordButton.setContentAreaFilled(false);
        passwordButton.setFocusPainted(false);
        passwordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordButtonMouseExited(evt);
            }
        });
        passwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordButtonActionPerformed(evt);
            }
        });

        aboutButton.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        aboutButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutButton.setText("About");
        aboutButton.setBorderPainted(false);
        aboutButton.setContentAreaFilled(false);
        aboutButton.setFocusPainted(false);
        aboutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutButtonMouseExited(evt);
            }
        });
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        folderChooser.setAcceptAllFileFilterUsed(false);
        folderChooser.setDialogTitle("Select Folder");
        folderChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        setUndecorated(true);
        setOpacity(.95f);

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
        titleLabel.setText("Easy Folder Locker");
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
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(closeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        footerPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));

        chanageThemeButton.setFont(new java.awt.Font("Trebuchet MS", 2, 11)); // NOI18N
        chanageThemeButton.setForeground(new java.awt.Color(255, 255, 255));
        chanageThemeButton.setText("Copyright (C) 2014 Developer Bhuwan");
        chanageThemeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        chanageThemeButton.setContentAreaFilled(false);
        chanageThemeButton.setFocusPainted(false);
        chanageThemeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chanageThemeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chanageThemeButtonMouseExited(evt);
            }
        });
        chanageThemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanageThemeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chanageThemeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(chanageThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        openLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        openLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        openLabel.setForeground(new java.awt.Color(255, 255, 255));
        openLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        openLabel.setOpaque(true);

        addLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        addLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addLabel.setOpaque(true);

        passwordLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        passwordLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordLabel.setOpaque(true);

        aboutLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        aboutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        aboutLabel.setOpaque(true);

        leftLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        leftLabel.setOpaque(true);

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(leftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aboutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(openLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(openLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addComponent(leftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/easy_folder_locker_descrip.png")));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rightLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        rightLabel.setOpaque(true);

        midLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        midLabel.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(midLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(rightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rightLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(midLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        CustomDialog dialog = new CustomDialog(this, true);
        dialog.setTitleLabelText("Exit");
        dialog.setLocationRelativeTo(this);
        dialog.setMessages("Are you sure to exit application ?");
        dialog.setVisible(true);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        hoverButton(closeButton);
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButton.setOpaque(false);
    }//GEN-LAST:event_closeButtonMouseExited

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        this.setLocation(evt.getXOnScreen() - this.getSize().width / 2, evt.getYOnScreen() - headerPanel.getSize().height / 2);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void chanageThemeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chanageThemeButtonMouseEntered
        hoverButton(chanageThemeButton);
    }//GEN-LAST:event_chanageThemeButtonMouseEntered

    private void chanageThemeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chanageThemeButtonMouseExited
        chanageThemeButton.setOpaque(false);
    }//GEN-LAST:event_chanageThemeButtonMouseExited

    private void chanageThemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanageThemeButtonActionPerformed

    }//GEN-LAST:event_chanageThemeButtonActionPerformed

    private void openButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseEntered
        hoverButton(openButton);
    }//GEN-LAST:event_openButtonMouseEntered

    private void openButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openButtonMouseExited
        openButton.setOpaque(false);
    }//GEN-LAST:event_openButtonMouseExited

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        hoverButton(addButton);
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setOpaque(false);
    }//GEN-LAST:event_addButtonMouseExited

    private void passwordButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordButtonMouseEntered
        hoverButton(passwordButton);
    }//GEN-LAST:event_passwordButtonMouseEntered

    private void passwordButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordButtonMouseExited
        passwordButton.setOpaque(false);
    }//GEN-LAST:event_passwordButtonMouseExited

    private void aboutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMouseEntered
        hoverButton(aboutButton);
    }//GEN-LAST:event_aboutButtonMouseEntered

    private void aboutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutButtonMouseExited
        aboutButton.setOpaque(false);
    }//GEN-LAST:event_aboutButtonMouseExited

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        loginDialog = new LoginDialog(this, true);
        loginDialog.setLocationRelativeTo(contentPanel);
        loginDialog.setVisible(true);
    }//GEN-LAST:event_openButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int returnVal = folderChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                boolean isAlready = false;
                Charset charset = Charset.forName("UTF-8");
                Path path = folderChooser.getSelectedFile().toPath();
                String envDirectory = System.getenv("ProgramFiles");
                Path fileLogDirectory = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_LOG_PATH, "file_info.bn");
                if (!Files.exists(fileLogDirectory)) {
                    Files.createFile(fileLogDirectory);
                }
                List<String> prevLines = Files.readAllLines(fileLogDirectory, charset);

                for (String s : prevLines) {
                    if (s.equalsIgnoreCase(path.toString())) {
                        isAlready = true;
                        break;
                    }
                }

                if (!isAlready) {
                    String hideCommand = "attrib +S +H " + "\"" + path + "\"";
                    Runtime.getRuntime().exec(hideCommand);
                    System.out.println(hideCommand);
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
                    ArrayList<String> lines = new ArrayList<>();
                    lines.add(path.toString());
                    Files.write(fileLogDirectory, lines, charset, StandardOpenOption.APPEND);
                } else {
                    JOptionPane.showMessageDialog(this, "Folder Name is Already Locked.", "Error", JOptionPane.WARNING_MESSAGE);
                }

            } catch (IOException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void passwordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordButtonActionPerformed
        changePasswordDialog = new ChangePasswordDialog(this, true);
        changePasswordDialog.setLocationRelativeTo(contentPanel);
        changePasswordDialog.setVisible(true);
    }//GEN-LAST:event_passwordButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        abountDialog = new AboutDialog(this, true);
        abountDialog.setSize(contentPanel.getWidth(), contentPanel.getHeight());
        abountDialog.setLocationRelativeTo(contentPanel);
        abountDialog.setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton chanageThemeButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JFileChooser folderChooser;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel midLabel;
    private javax.swing.JButton openButton;
    private javax.swing.JLabel openLabel;
    private javax.swing.JButton passwordButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void loadLookAndFeels() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void setApp() {
        this.setPreferredSize(new Dimension(1000, 700));
        this.setLocationRelativeTo(null);
        if (isPasswordSet()) {
            this.setVisible(true);
        } else {
            this.setVisible(true);
            createNewPasswordDialog = new CreateNewPasswordDialog(this, true);
            createNewPasswordDialog.setLocationRelativeTo(this);
            createNewPasswordDialog.setVisible(true);
        }

    }

    private void addLabelAndButton(JButton btn, JLabel lbl) {
        lbl.add(btn);
        btn.setBounds(0, 0, 200, 60);
        btn.setVisible(true);
    }

    private void hoverButton(JButton btn) {
        this.resetAllHover();
        btn.setBackground(Color.BLACK);
        btn.setOpaque(true);
    }

    public void resetAllHover() {
        openButton.setOpaque(false);
        addButton.setOpaque(false);
        passwordButton.setOpaque(false);
        aboutButton.setOpaque(false);
        chanageThemeButton.setOpaque(false);
    }

    private boolean isPasswordSet() {
        boolean status = true;
        try {
            String envDirectory = System.getenv("ProgramFiles");
            Path mainDir = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_DIR);
            if (!Files.exists(mainDir)) {
                Files.createDirectory(mainDir);
            }
            Path logDir = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_LOG_PATH);
            if (!Files.exists(logDir)) {
                Files.createDirectory(logDir);
            }

            Path passDirectory = FileSystems.getDefault().getPath(envDirectory + AppConstants.APP_LOG_PATH, "bnsecurity.bn");
            if (!Files.exists(passDirectory)) {
                status = false;
            } else if (Files.readAllBytes(passDirectory) == null) {
                status = false;
            }
        } catch (IOException ex) {
            Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public void addLockList() {
        lockedFileDialog = new LockedFileDialog(this, true);
        lockedFileDialog.setSize(contentPanel.getWidth(), contentPanel.getHeight());
        lockedFileDialog.setLocationRelativeTo(contentPanel);
        lockedFileDialog.fetchLockedFileList();
        lockedFileDialog.setVisible(true);
    }

}
