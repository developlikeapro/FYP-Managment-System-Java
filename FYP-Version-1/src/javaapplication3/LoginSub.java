/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 *
 * @author dell
 */

public class LoginSub {
 
  private  String username = "";
  public String firstName() { return username; } // getter
  public void firstName(String val) { username = val; } // setter
  
   private  int role;
  public int role() { return role; } // getter
  public void role(int val) { role = val; } // setter
  
  private  String password = "";
  public String password() { return password; } // getter
  public void password(String val) { password = val; } // setter

    public LoginSub(String username, int role, String password) {
        this.role = role;
        this.username = username;
        this.password = password;
    }
  
  
  
  
   
}