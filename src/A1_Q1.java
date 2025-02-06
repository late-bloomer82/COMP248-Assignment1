// --------------------------------------------------------------------
// Assignment 1
// Written by: Ahmad-Radjai Cherifi, 40327926
// For COMP 248 Section U – Winter 2025
// --------------------------------------------------------------------
import java.util.Scanner;

public class A1_Q1 {
    public static void main(String[] args) {

        // Print title
        System.out.println("\\---------------------------------------------------------\\");
        System.out.println("/           Simple Talisman-Land Access Program           /");
        System.out.println("\\---------------------------------------------------------\\");

        // Add a blank line for clarity
        System.out.print("");

        // Prompt user for a specific number
        System.out.print("Enter a code as an integer between 1 and 100 (inclusive): ");

        // Create scanner object to read user input later
        Scanner scanner = new Scanner(System.in);

        //Read user input using a nextLine
        String firstCode = scanner.nextLine();

        // Add a blank line for clarity
        System.out.println();

        // Compute the 3 buttons that should be pressed using charAt
        System.out.println("The first button to press is " + firstCode.charAt(0));
        System.out.println("The second button to press is " + firstCode.charAt(1));
        System.out.println("The third button to press is " + firstCode.charAt(2));

        // Add a blank line for clarity
        System.out.println();

        // Print ending message
        System.out.println("At Talisman-Land, we must safeguard the treasure.");

        // Close scanner for optimal resource usage.
        scanner.close();
    }
}