/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import java.awt.Toolkit;
import java.awt.Frame;

/**
 *
 * @author Shreyas
 */
public class StandaloneMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public StandaloneMenu() {
        initComponents();
        
        FadingEffect fader = new FadingEffect();
        fader.Fade(this);
        
//        mainActivity=this;
//        
//        Thread fading = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    int x=java.awt.MouseInfo.getPointerInfo().getLocation().x;
//                    int y=java.awt.MouseInfo.getPointerInfo().getLocation().y;
//                    if (x>mainActivity.getX()&&x<(mainActivity.getX()+mainActivity.getWidth())&&y>mainActivity.getY()&&y<(mainActivity.getY()+mainActivity.getHeight())) {
//                        mainActivity.setOpacity(1.0f);
//                    }
//                    else {
//                        mainActivity.setOpacity(0.75f);
//                    }
//                    try {
//                        Thread.sleep(100);
//                    } catch (Exception e) {
//                        
//                    }
//                }
//            }
//        });
//        fading.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMin = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        titleBar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPlayer2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnStart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPlayer3 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtPlayer4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        errorDialog = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ludo/images/icon.png")));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/min.png"))); // NOI18N
        btnMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });
        getContentPane().add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 9, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/close.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 9, -1, -1));

        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });
        getContentPane().add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlayer2.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer2.setBorder(null);
        txtPlayer2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("Player 2 : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, 10));

        btnStart.setBackground(new java.awt.Color(126, 87, 194));
        btnStart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 180, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("Player 3 : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtPlayer3.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer3.setBorder(null);
        txtPlayer3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 113, 177));
        jLabel3.setText("Player 4 : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtPlayer4.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPlayer4.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer4.setBorder(null);
        txtPlayer4.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 190, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 113, 177));
        jLabel4.setText("Player 1 : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        txtPlayer1.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer1.setBorder(null);
        txtPlayer1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 190, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/Blue.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/Red.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/Green.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/Yellow.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        errorDialog.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(errorDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 390, 380));

        btnMainMenu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ludo/images/mainBackground.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 450));

        setSize(new java.awt.Dimension(730, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen()-xMouse,evt.getYOnScreen()-yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        String str[]=new String[4];
        str[0]=txtPlayer1.getText();
        str[1]=txtPlayer2.getText();
        str[2]=txtPlayer3.getText();
        str[3]=txtPlayer4.getText();
        int cnt=0;
        for (int i=0;i<4;i++) {
            if (str[i].equals("")||str[i].equals(null)) {
                cnt++;
            }
        }
        if (cnt>2) {
            errorDialog.setText("* Atleast 2 players are required to start the game");
        }
        else {
            errorDialog.setText("");
            Test game = new Test();
            game.setLocation(this.getX(),this.getY());
            for (int i=0;i<4;i++) {
                if (!(str[i].equals("")||str[i].equals(null))) {
                    game.house[i].name=str[i];
                    game.house[i].isActive=true;
                    game.numActive++;
                }
                else {
                    game.house[i].isActive=false;
                    game.house[i].deactivate();
                }
            }
            
            this.setVisible(false);
            game.setVisible(true);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_btnMainMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StandaloneMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandaloneMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandaloneMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandaloneMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandaloneMenu().setVisible(true);
            }
        });
    }
    
    int xMouse,yMouse;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JLabel btnMin;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel errorDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel titleBar;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtPlayer3;
    private javax.swing.JTextField txtPlayer4;
    // End of variables declaration//GEN-END:variables
}
