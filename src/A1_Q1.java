import java.util.Scanner;
// --------------------------------------------------------------------
// Assignment 1
// Written by: Ahmad-Radjai Cherifi, 40327926
// For COMP 248 Section U – Winter 2025
// --------------------------------------------------------------------
public class A1_Q1 {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello User!");
        System.out.println("Enter a code as an integer between 1 and 100 (inclusive)! :");
        String firstCode = scanner.nextLine();
        System.out.println("The first button to press is : " +firstCode.charAt(0));
        System.out.println("The second button to press is : " + firstCode.charAt(1));
        System.out.println("The third button to press is : " + firstCode.charAt(2));
        // Add a blank line for clarity
        System.out.println();
        System.out.println("At Talisman-Land, we must safeguard the treasure.");

        // Close scanner for optimal resource usage.
        scanner.close();
    }
}