/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import java.awt.Toolkit;
import java.awt.Frame;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Shreyas
 */
public class GameOverStandalone extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public GameOverStandalone() {
        initComponents();
        
        ranks = new LinkedList<String>();
        
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
        jLabel4 = new javax.swing.JLabel();
        txtPlayer1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        errorDialog = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        txtPlayer2.setEditable(false);
        txtPlayer2.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer2.setBorder(null);
        txtPlayer2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 190, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 113, 177));
        jLabel1.setText("2 nd");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 190, 10));

        btnStart.setBackground(new java.awt.Color(126, 87, 194));
        btnStart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Main Menu");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 180, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 113, 177));
        jLabel2.setText("3 rd");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        txtPlayer3.setEditable(false);
        txtPlayer3.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPlayer3.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer3.setBorder(null);
        txtPlayer3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 190, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 113, 177));
        jLabel4.setText("1 st");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtPlayer1.setEditable(false);
        txtPlayer1.setBackground(new java.awt.Color(32, 33, 35));
        txtPlayer1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        txtPlayer1.setBorder(null);
        txtPlayer1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPlayer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 190, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 190, 10));

        errorDialog.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(errorDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 300, 20));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Game Over");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 390, 380));

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
        MainMenu game = new MainMenu();
        game.setLocation(this.getX(),this.getY());
        this.setVisible(false);
        game.setVisible(true);
    }//GEN-LAST:event_btnStartActionPerformed

    
    public void showList() {
        String tmp;
        if (ranks.size()>0) {
            tmp=ranks.remove();
            txtPlayer1.setText(tmp);
        }
        if (ranks.size()>0) {
            tmp=ranks.remove();
            txtPlayer2.setText(tmp);
        }
        if (ranks.size()>0) {
            tmp=ranks.remove();
            txtPlayer3.setText(tmp);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(GameOverStandalone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameOverStandalone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameOverStandalone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameOverStandalone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameOverStandalone().setVisible(true);
            }
        });
    }
    
    int xMouse,yMouse;
    Queue<String> ranks;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMin;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel errorDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel titleBar;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    private javax.swing.JTextField txtPlayer3;
    // End of variables declaration//GEN-END:variables
}
