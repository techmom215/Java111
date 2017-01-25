/* AgeDays.java
 * Console I/O dialog calculating a user's age in days.
 * for CSCI 111 Lab 2A  
 * Angela Andrews 1/25/17
 */
package agedays;

import java.util.*;

public class AgeDays {

    public static void main(String[] args) {

        String name;// user name
        double years;// age (in years)
        double days;// age (in days)
        final double DAYS_PER_YEAR = 365.25;// constant days per year
        Scanner kb = new Scanner(System.in);// declare an instance of Scanner to read the data stream from the keyboard.
// say hello to the user and ask for the user’s name
        System.out.println("Hello, please enter your name: ");
        name = kb.nextLine(); //using next line because the input is a multi-char string.
// say hello to the user by name.
        System.out.println("Hello, " + name);
// ask for the user’s age in years
        System.out.println("How many years old are you? ");
        years = kb.nextDouble();
// Calculate how many days are in the number of years entered
        days = years * DAYS_PER_YEAR;
// print results
        System.out.println(name + ",you are " + days + " days old.");
// close the input stream
        kb.close();

    }//end main ()

}  //end class AgeDays (this is how Source+format formatted the file.
