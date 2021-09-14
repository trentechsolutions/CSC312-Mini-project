package lms.resources.repository;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Keanu Johnston
 */
public class DatabaseConnection {
    
    public static Connection getCon()
    {
    
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdatabase?zeroDateTimeBehavior=convertToNull","root","joseppi");
            return con;
            
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
//    public Connection databaseLink;
//
//    public Connection getConnection(){
//        String databaseName = "jdbc-library-system-app";
//        String databaseUser = "root";
//        String databasePassword = "99KJ@PROm";
//        String url = "jdbc:mysql://localhost:3306/" + databaseName;
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
//        }catch(Exception e) {
//            e.printStackTrace();
//            e.getCause();
//        }
//
//        return databaseLink;
//    }
}
