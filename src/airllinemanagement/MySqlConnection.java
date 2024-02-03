package airllinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import raven.toast.Notifications;

public class MySqlConnection {

    static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/AirlLineManagement", "root", "PHW#84#jeor");

        } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error");
        }
    }

    public MySqlConnection() {

    }

}
