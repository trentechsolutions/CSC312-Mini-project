package lms;

import lms.resources.view.AdminMenu;
import lms.resources.adminController.AdminOperations;
import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new AdminMenu("My admin Menu");
        frame.setVisible(true);

        AdminOperations adminOperations = new AdminOperations();
        adminOperations.login();
    }
}
