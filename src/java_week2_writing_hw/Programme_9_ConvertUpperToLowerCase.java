package java_week2_writing_hw;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {
    /**
     * Write a program to convert the upper case to lower case.
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper case string: ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();
    }


    //Conversion of Uppercase to Lower case method
    public void convertUpperCaseToLowerCase(String text) {
        System.out.println("The lowercase value is: " + text.toLowerCase());
    }
}
