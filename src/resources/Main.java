package resources;
import javax.swing.*;
import resources.adminController.*;
import resources.view.*;
import resources.model.*;
import resources.userController.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new AdminMenu("My admin Menu");
        frame.setVisible(true);

        AdminOperations adminOperations = new AdminOperations();
        adminOperations.login();
    }
}
