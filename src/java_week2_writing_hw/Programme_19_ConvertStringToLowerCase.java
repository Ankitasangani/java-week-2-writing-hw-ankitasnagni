package java_week2_writing_hw;

import java.util.Scanner;

public class Programme_19_ConvertStringToLowerCase {
    /**
     * Write a Java program to convert a given string into lowercase.
     * * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * * Output: the quick brown fox jumps over the lazy dog.
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowercase(uppercase);
        //Closing the scanner object
        scanner.close();
    }

    //Convert string to the lower case
    public void convertStringToLowercase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
