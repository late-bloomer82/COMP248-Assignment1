// --------------------------------------------------------------------
// Assignment 1
// Written by: Ahmad-Radjai Cherifi, 40327926
// For COMP 248 Section U – Winter 2025
// --------------------------------------------------------------------
import java.util.Scanner;

public class A1_Q2 {
    public static void main(String[] args) {

        System.out.println("\\-------------------------------------------------------------------------\\");
        System.out.println("/           Simple Concordia Ready-to-Eat Meals Invoice Program           /");
        System.out.println("\\-------------------------------------------------------------------------\\");
        System.out.print("Enter the prepaid gift card retailer/bank name: " );
        Scanner scanner = new Scanner(System.in);
        String paymentMethod = scanner.nextLine();
        paymentMethod = paymentMethod.toUpperCase();
        System.out.println("You will be using " + paymentMethod + " gift card for your meal(s) purchase." );
        System.out.print("Enter the amount on the gift card: " );
        double amount = scanner.nextDouble();
        System.out.println("There is a fund of $" + amount + " on your prepaid " + paymentMethod + " gift card." );
        double numberOfMealsDecimal = Math.floor(amount/10.75);
        int maxNumberOfMeals = (int) numberOfMealsDecimal;
        double maxPurchaseCost = maxNumberOfMeals *10.75;
        double maxBalanceLeft = amount-maxPurchaseCost;
        System.out.println("Using your " + paymentMethod + " gift card you can purchase " + maxNumberOfMeals + " meals and have a balance of $" + maxBalanceLeft + " on the gift card."  );
        System.out.print("Enter the number of meals you want to purchase: " );
        int numOfMeals = scanner.nextInt();
        double purchaseCost = numOfMeals *10.75;
        double balanceLeft = amount-purchaseCost;
        System.out.println("The purchase of " + numOfMeals + " meal(s) costs $" + purchaseCost + ".");
        System.out.println("The balance left on your " + paymentMethod + " gift card is $" + balanceLeft + ".");
        System.out.println();
        System.out.println("Please enter your purchase info: ");
        System.out.println();
        System.out.print("Day Of purchase (between 1 and 31): ");
        int dayOfPurchase = scanner.nextInt();
        System.out.print("Month Of purchase (between 1 and 12): ");
        int monthOfPurchase = scanner.nextInt();
        System.out.print("Year Of purchase (between 2025 and 2030): ");
        int yearOfPurchase = scanner.nextInt();
        String date = yearOfPurchase+"/"+monthOfPurchase+"/"+dayOfPurchase;
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tCatering Service Concordia       " + date );
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
        System.out.println(numOfMeals + " meals\t\t\t\t\t\t\t\t\t\t\t$" + purchaseCost);
        System.out.println("$" + purchaseCost + "was redeemed from " + paymentMethod + " prepaid gift card.");
        System.out.println(paymentMethod + "gift card balance\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$" + balanceLeft);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Invoice generated successfully.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Thank you for using my bespoke Concordia Ready-to-Eat Meals Invoice Program!");
    }
}
