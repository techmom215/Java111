/*
 * JOptionPaneDemo program
 * CSCI 111 Sprint 2017
 * sample dialog using pop-up windows 
 * laste edited 1/25/17 Angela Andrews
 */
package joptionpanedemo;
import javax.swing.*;

public class JOptionPaneDemo {

    /**
     * This method demonstrates the use of JoptionPane Class objects
     * for simple pop-up Windows dialog boxes
     */
    public static void main(String[] args) 
    {       
        String name;        // the user's name
        String inputString; // String to hold input dialog value
        double age;         // the user's age
        double days;        // the user's age in days
        final double DAYS_PER_YEAR = 365.25; //constant days per year
        
        // say hello with a message dialog window
        JOptionPane.showMessageDialog(null, "Hello. Welcome to Computer Science 111.");
        
        // get the user’s name with an input dialog window
        name = JOptionPane.showInputDialog("What is you name?");
        
        
        // get the user age with an input dialog window; use the name in the message
        // parse age to a double variable
        inputString = JOptionPane.showInputDialog( "Hello " + name + ", how old are you?");
        age = Double.parseDouble(inputString);

        // calculate age in days
        days = 365.25 * age;
        
        // tell the user’s age in days with a message dialog window
        JOptionPane.showMessageDialog(null, name + ", you are "+ days + " days old.");
        
    } // end main()

} // end class JOptionPaneDemo
