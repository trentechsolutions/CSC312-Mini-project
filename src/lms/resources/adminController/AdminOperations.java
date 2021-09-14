package lms.resources.adminController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lms.resources.adminController.TempLoginPage;
import java.util.HashMap;
import lms.resources.model.User;

public class AdminOperations {
    public AdminOperations(){
        
    }
    public HashMap<Integer,Admin>  getAdmins(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdatabase","root","joseppi");
        }catch(SQLException e){
            e.printStackTrace();
        }
       
        HashMap<Integer, Admin> admins = new HashMap<Integer, Admin>();

        Statement st = null;
        ResultSet rs = null;
        try{
        st = con .createStatement();
        rs = st.executeQuery("SELECT * FROM admin");
        while(rs.next()){
        Integer id = rs.getInt("admin_id");
        Admin admin = new Admin(rs.getInt("admin_password"));
        admins.put(id, admin);
        }
        }catch(Exception  e){
                    e.printStackTrace();
        
        }
    return admins;
    }
    public HashMap<Integer, User> getUsers(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsdatabase","root","joseppi");
        }catch(SQLException e){
            e.printStackTrace();
        }
        HashMap<Integer, User> users= new HashMap<Integer, User>();
        Statement st = null;
        ResultSet rs = null;
        try{
        st = con .createStatement();
        rs = st.executeQuery("SELECT * FROM user");
        while(rs.next()){
        Integer id = rs.getInt("user_id");
        User user = new User(rs.getString("user_fname"),rs.getString("user_lname"),rs.getString("user_email"),rs.getString("user_password"));
        user.userFined = rs.getBoolean("is_fined");
        users.put(id, user);
        }
        }catch(Exception  e){
                    e.printStackTrace();
                }
        return users;
    }
}
