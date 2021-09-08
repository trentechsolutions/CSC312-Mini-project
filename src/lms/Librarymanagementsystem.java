/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import javax.swing.JFrame;
import lms.resources.adminController.AdminOperations;
import lms.resources.view.AdminMenu;
import lms.resources.view.TestFrontend;

/**
 *
 * @author Keanu
 */
public class Librarymanagementsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new TestFrontend();
        frame.setVisible(true);
       

//        AdminOperations adminOperations = new AdminOperations();
//        adminOperations.login();
    }
}
