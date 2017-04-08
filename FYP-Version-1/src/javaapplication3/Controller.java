/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author dell
 */
public class Controller {
    public Cstudent Ostudent;
    public Cadvisor Oadvisor;
    public Cexternal Oexternal;
    public Cinternal Ointernal ;

    public Controller() {
         
        Ostudent = new Cstudent();
        Oadvisor = new Cadvisor();
        Oexternal = new Cexternal();
        Ointernal = new Cinternal();
        
        
    }
    
    
}
