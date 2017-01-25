/*
 * Celsius to Fahrenheith Converter
 * CSCI 111 Spring 2017
 * I-P-O software
 *  1/25/17 Angela Andrews
 */
package celsiusconverter;

import javax.swing.*;

public class CelsiusConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables

        String inputCity; //String to hold input dialog value
        String inputTemp; // string to hold input temperature
        String city; // Name of City (String)
        double cTemp;// Current Temp in City  Celsius(double)
        double fTemp; // Current Temp in City  Fahrenheit (double)
        final String DEGREE = "\u00b0"; //degree symbol in unicode

        // Ask the user for the name of the city they're in with an input dialog window
        inputCity = JOptionPane.showInputDialog("What city are you currently located?");
        city = inputCity;

        // Ask the user for the temp in Celsius with an input dialog window
        inputTemp = JOptionPane.showInputDialog("What is the current temperature in " + city + " in degrees Celsius?");

// parse ctemp from input to double
        cTemp = Double.parseDouble(inputTemp);
// convert Celsius to degrees in Fahrenheit using the formula:  F = (  9/5 * C) + 32 <- puts me off 10 degrees.
        fTemp = cTemp * 9/5  + 32;
// print results

        JOptionPane.showMessageDialog(null, "The current temperature in  " + city + " is " + cTemp + DEGREE + "C, which is  " + fTemp + DEGREE + "F.");

    } //end main ()

}  //end CelsiusConverter
