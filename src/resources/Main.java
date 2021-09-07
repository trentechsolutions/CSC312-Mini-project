package resources;

import resources.adminController.AdminOperations;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new AdminMenu("My admin Menu");
        frame.setVisible(true);

        AdminOperations adminOperations = new AdminOperations();
        adminOperations.login();
    }
}
