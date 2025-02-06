// --------------------------------------------------------------------
// Assignment 1
// Written by: Ahmad-Radjai Cherifi, 40327926
// For COMP 248 Section U – Winter 2025
// --------------------------------------------------------------------
// The Simple Concordia Ready-to-Eat Meals Invoice Program prompts the user to input a number of details, such as the payment method, funds available, number of meals
// to purchase and date of purchase. Using this information, it calculates how many meals can be bought and the balance left on the gift card after purchase.
// The program then generates an invoice for the purchase with the relevant information and then prints a closing message for the user.

import java.util.Scanner;

public class A1_Q2 {
    public static void main(String[] args) {

        // Print title of program
        System.out.println("\\-------------------------------------------------------------------------\\");
        System.out.println("/           Simple Concordia Ready-to-Eat Meals Invoice Program           /");
        System.out.println("\\-------------------------------------------------------------------------\\");

        // Prompt user to enter prepaid card or bank name
        System.out.print("Enter the prepaid gift card retailer/bank name: " );

        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Read the user input as a string
        String paymentMethod = scanner.nextLine();

        // Convert user input to uppercase letters
        paymentMethod = paymentMethod.toUpperCase();

        // Print method of payment
        System.out.println("You will be using " + paymentMethod + " gift card for your meal(s) purchase." );

        // Prompt user to enter funds on the method of payment
        System.out.print("Enter the funds on the gift card: " );

        // Read the funds in decimals
        double funds = scanner.nextDouble();

        // Print amount of funds and method of payment
        System.out.println("There is a fund of $" + funds + " on your prepaid " + paymentMethod + " gift card." );

        // Compute maximum number of meals possible with available funds and round it down to the nearest integer
        double maxNumberOfMealsDecimal = Math.floor(funds/10.75);

        // Convert double to integer number
        int maxNumberOfMeals = (int) maxNumberOfMealsDecimal;

        // Compute the maximum purchase cost and the corresponding maximum balance left
        double maxPurchaseCost = maxNumberOfMeals *10.75;
        double maxBalanceLeft = Math.round((funds-maxPurchaseCost) * 10.0)/ 10.0; // Round the number to a single decimal digit

        // Print the information to the user
        System.out.println("Using your " + paymentMethod + " gift card you can purchase " + maxNumberOfMeals + " meals and have a balance of $" + maxBalanceLeft + " on the gift card."  );

        // Prompt the user to enter the number of meals they want to purchase
        System.out.print("Enter the number of meals you want to purchase: " );

        // Read the input
        int numOfMeals = scanner.nextInt();

        // Compute the resulting purchase cost and balance left
        double purchaseCost = numOfMeals *10.75;
        double balanceLeft = funds-purchaseCost;

        // Print information to the user
        System.out.println("The purchase of " + numOfMeals + " meal(s) costs $" + purchaseCost + ".");
        System.out.println("The balance left on your " + paymentMethod + " gift card is $" + balanceLeft + ".");

        // Add blank line for clarity
        System.out.println();

        // Prompt user to enter following purchase information
        System.out.println("Please enter your purchase info: ");

        // Add blank line for clarity
        System.out.println();

        // Prompt user to enter day of purchase and then read the input
        System.out.print("Day Of purchase (between 1 and 31): ");
        int dayOfPurchase = scanner.nextInt();

        // Prompt user to enter month of purchase and then read the input
        System.out.print("Month Of purchase (between 1 and 12): ");
        int monthOfPurchase = scanner.nextInt();

        // Prompt user to enter year of purchase and then read the input
        System.out.print("Year Of purchase (between 2025 and 2030): ");
        int yearOfPurchase = scanner.nextInt();

        // Format the inputted information into a single comprehensive date
        String date = dayOfPurchase+"/"+monthOfPurchase+"/"+yearOfPurchase;

        // Add blank line for clarity
        System.out.println();

        // Print the invoice using the prior formatted date
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tCatering Service Concordia       " + date );

        // Add blank lines for clarity
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

        // Print the invoice purchase information
        System.out.println(numOfMeals + " meals\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$" + purchaseCost);
        System.out.println("$" + purchaseCost + " was redeemed from " + paymentMethod + " prepaid gift card.");
        System.out.println(paymentMethod + " gift card balance\t\t\t\t\t\t\t\t\t\t\t\t\t$" + balanceLeft);

        // Print the footer and confirmation message
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Invoice generated successfully.");
        System.out.println();
        System.out.println();
        System.out.println();

        // Print closing message
        System.out.println("Thank you for using my bespoke Concordia Ready-to-Eat Meals Invoice Program!");

        // Close scanner for resource optimization
        scanner.close();
    }
}
