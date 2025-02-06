// --------------------------------------------------------------------
// Assignment 1
// Written by: Ahmad-Radjai Cherifi, 40327926
// For COMP 248 Section U – Winter 2025
// --------------------------------------------------------------------
// The Simple Talisman-Land Access Program prompts the user to enter a 3 digit integer code between 000 and 999. The program assumes valid input and based on the code entered,
// it computes and displays a sequence of three buttons to press to gain access to Talisman Land. The program ends after displaying a closing
// message to the user.

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

        // Create scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Read user input using nextInt
        int code = scanner.nextInt();

        // Compute and store inside variables the 3 digits from the code entered
        int firstButton = (code / 100) % 10;
        int secondButton = (code / 10) % 10;
        int thirdButton = code % 10;

        // Add a blank line for clarity
        System.out.println();

        // Print the 3 buttons to be pressed
        System.out.println("\t\tThe first button to press is " + firstButton);
        System.out.println("\t\tThe second button to press is " + secondButton);
        System.out.println("\t\tThe third button to press is " + thirdButton);

        // Add a blank line for clarity
        System.out.println();

        // Print ending message
        System.out.println("At Talisman-Land, we must safeguard the treasure.");

        // Close scanner for optimal resource usage.
        scanner.close();
    }
}