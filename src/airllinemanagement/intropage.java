package airllinemanagement;

import javax.swing.JLabel;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import Main_Application.Main;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class intropage extends javax.swing.JFrame {

    public intropage() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialmedia/20.jpg")));
        svgIconLinkedin.setSVGIcon("socialmedia/linkedin1.svg", 40, 40);
        svgIconLinkedin.setCursorHand();
        svgIconGitHub.setSVGIcon("socialmedia/Github1.svg", 40, 40);
        svgIconGitHub.setCursorHand();        
    }

    
    private void setsocialmedia() {
    try {
        InputStream inputStream = getClass().getResourceAsStream("/socialmedia/linkedin1.png");
        ImageIcon icon = new ImageIcon(ImageIO.read(inputStream));
        JLabel label = new JLabel(icon);
        kGradientPanel.add(label);

        inputStream = getClass().getResourceAsStream("/socialmedia/GitHub1.png");
        icon = new ImageIcon(ImageIO.read(inputStream));
        label = new JLabel(icon);
        kGradientPanel.add(label);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel = new keeptoo.KGradientPanel();
        labairlLine_management_system = new javax.swing.JLabel();
        lodingValue = new javax.swing.JLabel();
        lodingtxt = new javax.swing.JLabel();
        lodingBar = new javax.swing.JProgressBar();
        lodingChange = new javax.swing.JLabel();
        lab_teamName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        svgIconGitHub = new SVGIcon.svgIcon();
        svgIconLinkedin = new SVGIcon.svgIcon();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel.setkEndColor(new java.awt.Color(142, 183, 225));
        kGradientPanel.setkGradientFocus(450);
        kGradientPanel.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labairlLine_management_system.setFont(new java.awt.Font("Tahoma", 3, 34)); // NOI18N
        labairlLine_management_system.setForeground(new java.awt.Color(255, 255, 255));
        labairlLine_management_system.setText("AirlLine Management System");
        labairlLine_management_system.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel.add(labairlLine_management_system, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 34, 610, -1));

        lodingValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lodingValue.setForeground(new java.awt.Color(255, 255, 255));
        lodingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lodingValue.setText("0%");
        kGradientPanel.add(lodingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        lodingtxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lodingtxt.setForeground(new java.awt.Color(255, 255, 255));
        lodingtxt.setText("Loding...");
        kGradientPanel.add(lodingtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 73, -1));
        kGradientPanel.add(lodingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 440, 10));

        lodingChange.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lodingChange.setForeground(new java.awt.Color(255, 255, 255));
        lodingChange.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        kGradientPanel.add(lodingChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 302, 20));

        lab_teamName.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lab_teamName.setForeground(new java.awt.Color(255, 255, 255));
        lab_teamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_teamName.setText("ElZoz");
        lab_teamName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel.add(lab_teamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialmedia/20.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        kGradientPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 610, 370));
        kGradientPanel.add(svgIconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 40, 40));

        svgIconLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgIconLinkedinMouseClicked(evt);
            }
        });
        kGradientPanel.add(svgIconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 40, 40));

        getContentPane().add(kGradientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void svgIconLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconLinkedinMouseClicked
        try{
        Desktop.getDesktop().browse(new URL("").toURI());
        } catch(Exception e){
        
        }
    }//GEN-LAST:event_svgIconLinkedinMouseClicked

    private void svgIconGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconGitHubMouseClicked
        try{
        Desktop.getDesktop().browse(new URL("").toURI());
        } catch(Exception e){
        
        }       
    }//GEN-LAST:event_svgIconGitHubMouseClicked

    
    
 public static void main(String args[]) {
        FlatMacDarkLaf.setup();
        intropage loding = new intropage();
        loding.setVisible(true);

        try {            
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                loding.lodingValue.setText(i + "%"); 

                if (i == 8) {
                    loding.lodingChange.setText("Turning On Modules...");
                    loding.lodingtxt.setText("Loding.");
                }

                if (i == 20) {
                    loding.lodingChange.setText("Loding Modules...");
                    loding.lodingtxt.setText("Loding..");
                }

                if (i == 40) {
                    loding.lodingtxt.setText("Loding...");
                }

                if (i == 50) {
                    loding.lodingChange.setText("Connecting To Database...");
                    loding.lodingtxt.setText("Loding....");
                }

                if (i == 65) {
                    loding.lodingtxt.setText("Loding...");
                }

                if (i == 70) {
                    loding.lodingChange.setText("Connection Successful !");
                    loding.lodingtxt.setText("Loding..");
                }

                if (i == 80) {
                    loding.lodingChange.setText("Launching Application");
                    loding.lodingtxt.setText("Loding.");
                }

                if (i == 95) {
                    loding.lodingtxt.setText("Loding...");
                }

                loding.lodingBar.setValue(i);  

            }

            loding.setVisible(false);
            new loginpage().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JLabel lab_teamName;
    private javax.swing.JLabel labairlLine_management_system;
    private javax.swing.JProgressBar lodingBar;
    private javax.swing.JLabel lodingChange;
    private javax.swing.JLabel lodingValue;
    private javax.swing.JLabel lodingtxt;
    private SVGIcon.svgIcon svgIconGitHub;
    private SVGIcon.svgIcon svgIconLinkedin;
    // End of variables declaration//GEN-END:variables
}
