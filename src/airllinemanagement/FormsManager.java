package airllinemanagement;

import Main_Application.Main;
import javax.swing.*;
import java.awt.*;
//import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

public class FormsManager {

    private Main application;
    private static FormsManager instance;

    public static FormsManager getInstance() {
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }

    private FormsManager() {

    }

    public void initApplication(Main application) {
        this.application = application;
    }
    
    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            //FlatAnimatedLafChange.showSnapshot();
            application.setContentPane(form);
            application.revalidate();
            application.repaint();
            //FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }
}
