package Main_Application;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import airllinemanagement.FormsManager;
import airllinemanagement.intropage;
import javax.swing.JFrame;
import airllinemanagement.loginpage;
import javax.swing.SwingUtilities;


public class Main extends JFrame{
    public Main(){
        init();    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Airline management application");
        setSize(800, 600);
        setLocationRelativeTo(null);

        
        intropage introPage = new intropage();
        FormsManager.getInstance().initApplication(this);
        
    }
    
  private void init(){
        setTitle("Contacts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 750));
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Icons/airllinemanagement icon app.png")));
        FormsManager.getInstance().initApplication(this);      
        setContentPane(new loginpage());

    
  }
    public static void main(String[] args) {
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(() -> new Main().setVisible(true));
         
            Main main = new Main();
            main.setVisible(true);
        
    }  
    }


  
