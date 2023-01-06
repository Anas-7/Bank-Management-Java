/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management;

/**
 *
 * @author Mohammad Anas
 */
public class Bank_management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Starting the first page.
        first_page starting_program=new first_page();
        starting_program.setVisible(true);
        //Set the background.
        starting_program.getContentPane().setBackground(new java.awt.Color(0, 221, 229));
    }
    
}
