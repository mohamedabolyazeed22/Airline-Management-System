package airllinemanagement;

import javax.swing.JLabel;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import Main_Application.Main;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class intropage extends javax.swing.JFrame {

    public intropage() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialmedia/20.jpg")));
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
        svgIconGitHub = new javax.swing.JLabel();
        pngIconLinkedin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        SVGlconGitHub = new javax.swing.JLabel();
        SVGlconLinkedin = new javax.swing.JLabel();

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
        kGradientPanel.add(lodingChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 344, 302, 20));

        lab_teamName.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lab_teamName.setForeground(new java.awt.Color(255, 255, 255));
        lab_teamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_teamName.setText("ElZoz");
        lab_teamName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        kGradientPanel.add(lab_teamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 150, 40));

        svgIconGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airllinemanagement/social media/GitHub1.png"))); // NOI18N
        svgIconGitHub.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                svgIconGitHubAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        kGradientPanel.add(svgIconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        pngIconLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airllinemanagement/social media/LinkedIn1.png"))); // NOI18N
        pngIconLinkedin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pngIconLinkedinAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        kGradientPanel.add(pngIconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialmedia/20.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        kGradientPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 610, 370));

        SVGlconGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialmedia/GitHub1.png"))); // NOI18N
        kGradientPanel.add(SVGlconGitHub, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        SVGlconLinkedin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/socialmedia/LinkedIn1.png"))); // NOI18N
        kGradientPanel.add(SVGlconLinkedin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, -1, -1));

        getContentPane().add(kGradientPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 867, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void svgIconLinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconLinkedinMouseClicked

    }//GEN-LAST:event_svgIconLinkedinMouseClicked

    private void svgIconGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgIconGitHubMouseClicked
       
    }//GEN-LAST:event_svgIconGitHubMouseClicked

    private void pngIconLinkedinAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pngIconLinkedinAncestorAdded
        // TODO add your handling code here:
         try{
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/mohamed-abo-el-yazeed-246a78255/").toURI());
        } catch(Exception e){

        }

    }//GEN-LAST:event_pngIconLinkedinAncestorAdded

    private void svgIconGitHubAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_svgIconGitHubAncestorAdded
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().browse(new URL("https://github.com/MohamedAboElYazeed").toURI());
        } catch(Exception e){

        }
    }//GEN-LAST:event_svgIconGitHubAncestorAdded

 public static void main(String args[]) {
        FlatMacLightLaf.setup();
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
            new Main().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SVGlconGitHub;
    private javax.swing.JLabel SVGlconLinkedin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel;
    private javax.swing.JLabel lab_teamName;
    private javax.swing.JLabel labairlLine_management_system;
    private javax.swing.JProgressBar lodingBar;
    private javax.swing.JLabel lodingChange;
    private javax.swing.JLabel lodingValue;
    private javax.swing.JLabel lodingtxt;
    private javax.swing.JLabel pngIconLinkedin;
    private javax.swing.JLabel svgIconGitHub;
    // End of variables declaration//GEN-END:variables
}
