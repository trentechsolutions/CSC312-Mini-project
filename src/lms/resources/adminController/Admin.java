/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms.resources.adminController;

/**
 *
 * @author Yusuf
 */
public class Admin{
    Integer password;
    public Admin(Integer pass){
        password = pass;
        }
    public Integer getPassword(){
        return password;
    }

}
