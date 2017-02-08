/*
 * GPA  Branching App
 * 2/8/17
 * CSCI 111 Spring 2017
 * Using PopUps to get data & Branching to choose output
 * Angela Andrews  
 */
package gpabranching;
import javax.swing.*;

public class GPABranching {

   
    public static void main(String[] args) {
       String name;  // user's name
       String inputGpa; //input gpa
       double gpa;  //user's gpa
       
       //Greet & prompt for student's name
       JOptionPane.showMessageDialog(null, "Hello student. Let's determine your graduation status. ");
       name = JOptionPane.showInputDialog("What is your name?");
       
       //Get the Student's GPA
       //parse GPA to a double
       inputGpa=JOptionPane.showInputDialog("Hello " + name + ", what is your GPA?");
       gpa = Double.parseDouble(inputGpa);
       
       //System.out.println(gpa + " " + name);
       
       if (gpa >= 3.8 && gpa <=4.0) //summa cum laude
           System.out.println(name + ", your GPA is " + gpa + ". You are graduating Summa Cum Laude, congratulations!");
       else if (gpa >= 3.6 && gpa< 3.8) //magna cum laude
           System.out.println(name + ", your GPA is " + gpa + ". You are graduating Magna Cum Laude. Great job.");
       else if (gpa >= 3.2 && gpa < 3.6) //cum laude
             System.out.println(name + ", your GPA is " + gpa + ". You are graduating Cum Laude. Good work.");
       else if (gpa >=2.0 && gpa < 3.2) //eligible to graduate
            System.out.println(name + ", your GPA is " + gpa + ". You are eligible to graduate.");
       else if (gpa< 2.0) //can't graduate
           System.out.println(name + ", your GPA is " + gpa + ". You cannot graduate. Please see your advisor.");
       else 
           System.out.println("You entered an incorrect GPA"); //incorrect input
   
       
    } //end main()
    
} //end class GPABranching
