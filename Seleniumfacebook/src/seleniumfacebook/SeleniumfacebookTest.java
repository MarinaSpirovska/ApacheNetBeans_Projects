/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumfacebook;

/**
 *
 * @author Lenovo
 */
public class SeleniumfacebookTest extends Myselenium {
    public void tc_login () {
            super.InputFieldByName("email", "marinabitola.ms@gmail.com");
    }
    public void tc_userandpass(){
        super.InputFieldByName("email", "marinabitola.ms@gmail.com");
        super.InputFieldByName("pass","");
    }  
}
