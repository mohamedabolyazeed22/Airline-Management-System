package airllinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import raven.toast.Notifications;

public class MySqlConnection {
     public static Connection con;
     
      public MySqlConnection() {
         connect();
    }
    
    public void connect(){
        try {
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/AirlLineManagement","root","PHW#84#jeor");
       
         } catch (SQLException ex) {
            Notifications.getInstance().show(Notifications.Type.WARNING,"There is no Connection With Database!");
    }
    }}