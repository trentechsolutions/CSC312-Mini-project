package library.system.app.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Module to connect to DB
//create scheme
public class myJDBC {

    public static void main(String[] args){

        try{
            //context of statements is sent via this connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-library-system-app","root","99KJ@PROm");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from admin");

            //loop through elements in table
            while (resultSet.next()){
                System.out.println(resultSet.getString("AdminID"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}