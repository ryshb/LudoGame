/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludo;

import java.awt.Toolkit;
import java.awt.Frame;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Shreyas
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public Server() {
        initComponents();
        
        //names=new String[4];
        
        FadingEffect fader = new FadingEffect();
        fader.Fade(this);
        
        game=new LAN();
        game.setServer(true);
        
        //clients = new ArrayList<>();
//        int port=5077;
//        try {
//            ss=new ServerSocket(port);
//        }
//        catch (Exception e) {
//            
//        }
        
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
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        editPort = new javax.swing.JCheckBox();
        btnOK = new javax.swing.JButton();
        errorDialog = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnIP = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(33, 35, 37));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(32, 33, 35));
        txtName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 190, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 113, 177));
        jLabel4.setText("Name : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 10));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 113, 177));
        jLabel5.setText("Port : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtPort.setEditable(false);
        txtPort.setBackground(new java.awt.Color(32, 33, 35));
        txtPort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPort.setForeground(new java.awt.Color(255, 255, 255));
        txtPort.setText("5077");
        txtPort.setBorder(null);
        txtPort.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 100, 60, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 50, 10));

        editPort.setBackground(new java.awt.Color(33, 35, 37));
        editPort.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        editPort.setForeground(new java.awt.Color(57, 113, 177));
        editPort.setText("  Edit");
        editPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPortActionPerformed(evt);
            }
        });
        jPanel1.add(editPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        btnOK.setBackground(new java.awt.Color(126, 87, 194));
        btnOK.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(255, 255, 255));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel1.add(btnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, -1));

        errorDialog.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(errorDialog, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 300, 20));

        btnStart.setBackground(new java.awt.Color(126, 87, 194));
        btnStart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 255, 255));
        btnStart.setText("Start");
        btnStart.setEnabled(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 100, -1));

        btnIP.setBackground(new java.awt.Color(126, 87, 194));
        btnIP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIP.setForeground(new java.awt.Color(255, 255, 255));
        btnIP.setText("Get IP");
        btnIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIPActionPerformed(evt);
            }
        });
        jPanel1.add(btnIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 340, 320));

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

    private void editPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPortActionPerformed
        // TODO add your handling code here:
        txtPort.setEditable(editPort.isSelected());
    }//GEN-LAST:event_editPortActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        String name=txtName.getText();
        String port=txtPort.getText();
        if (name.equals("")||name.equals(null)) {
            errorDialog.setText(" * Enter name");
        }
        else if (!isValid(port)) {
            errorDialog.setText(" * Enter a valid port");
            txtPort.setText("5077");
        }
        else {
            int portNum=Integer.valueOf(port);
            Waiting window = new Waiting(this,game.ss,portNum);
            window.setVisible(true);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIPActionPerformed
        // TODO add your handling code here:
        try {
            InetAddress thisIP = InetAddress.getLocalHost();
            System.out.println("IP : "+thisIP.getHostAddress());
            JOptionPane.showMessageDialog(null,thisIP.getHostAddress());
        }
        catch (Exception e) {
            
        }
    }//GEN-LAST:event_btnIPActionPerformed

    private boolean isValid(String str) {
        try {
            int num=Integer.valueOf(str);
        }
        catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public void ready(List<Sockets> client) {
        this.game.clients=client;
//        for (int i=0;i<clients.size();i++) {
//            clients.get(i).start();
//        }
        start=true;
        btnStart.setEnabled(true);
        errorDialog.setText(game.clients.size()+" clients found");
        game.names[0]=txtName.getText();
        for (int i=0;i<game.clients.size();i++) {
            game.clients.get(i).write("getname");
        }
        
    }
    
    public void receive(String str,int id) {
        // Client Server commmands
        // All server client commands to be written here
        // for client
        // str is received from the ith clients
        if (str.startsWith("name:")) {
            System.out.println("Got names");
            // receiving name of the client
            str=str.substring(str.indexOf(':')+1);
            game.names[id+1]=str;
            cnt++;
            if (cnt==game.clients.size()) {
                 
                System.out.println("Game can be started");
                game.setLocation(this.getX(),this.getY());
                for (int i=0;i<=cnt;i++) {
                    System.out.println("for loop "+i);
                    if (!(game.names[i].equals("")||game.names[i].equals(null))) {
                        System.out.println("Aap kaam se kaam rakho");
                        game.house[i].name=game.names[i];
                        game.house[i].isActive=true;
                        game.numActive++;
                    }
                    else {
                        System.out.println("else block");
                        game.house[i].isActive=false;
                        //game.house[i].deactivate();
                    }
                }
                //game.setVisible(true);
                startGame();
                
                
            }
        }
        else if (str.startsWith("name:")) {
            
        }
    }
    
    public void startGame() {
        System.out.println("Start game called");
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i=0;i<game.clients.size();i++) {
                    game.clients.get(i).write("start");
                }
                System.out.println("Clients : "+game.clients);
                game.setVisible(true); 
//                new LAN().setVisible(true);//game;
//            newGame.clients=game.clients;
//            newGame.cnt=game.cnt;
//            newGame.names=game.names;
//            newGame.ss=game.ss;
//            newGame.setVisible(true);
                
            }
        }).start();
        
    }
    
    /*
    public void sdf() {
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
    }
    */
    
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
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });
    }
    
    int xMouse,yMouse;
    //List<Sockets> clients;
    boolean start;
    //ServerSocket ss;
    //String names[];
    int cnt=0;
    LAN game;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnIP;
    private javax.swing.JLabel btnMin;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnStart;
    private javax.swing.JCheckBox editPort;
    private javax.swing.JLabel errorDialog;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel titleBar;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
