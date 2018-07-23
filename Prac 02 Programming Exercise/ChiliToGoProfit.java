/**
 * Created by Lenovo on 7/19/2018.
 */

// This Program is to calculated the total price of the total melas ordered and see the profit from it.

import java.util.Scanner;

public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        final double ADULT_MEAL_PRICE = 7;
        final double CHILD_MEAL_PRICE = 4;
        final double ADULT_FUND_COST = 4.35;
        final double CHILD_FUND_COST = 3.10;
        int adultMeals;
        int childMeals;
        double totalPriceAdult;
        double totalPriceChild;
        double finalPrice;
        double profitFromAdult;
        double profitFromChild;
        double totalProfit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of adult meals you want to order: ");
        adultMeals = input.nextInt();
        System.out.print("Enter the number of child meals you want to order: ");
        childMeals = input.nextInt();
        totalPriceAdult = adultMeals * ADULT_MEAL_PRICE;
        totalPriceChild = childMeals * CHILD_MEAL_PRICE;
        finalPrice = totalPriceAdult + totalPriceChild;
        profitFromAdult = totalPriceAdult - (adultMeals * ADULT_FUND_COST);
        profitFromChild = totalPriceChild - (childMeals * CHILD_FUND_COST);
        totalProfit = profitFromAdult + profitFromChild;
        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_MEAL_PRICE + " each.");
        System.out.println("      Total price is " + totalPriceAdult);
        System.out.println(childMeals + " child meals were ordered at " + CHILD_MEAL_PRICE + " each.");
        System.out.println("      Total price is " + totalPriceChild);
        System.out.println("Final price for all meals is " + finalPrice);
        System.out.println("\n");
        System.out.println("Profits:");
        System.out.println("      Profit form adult is " + profitFromAdult);
        System.out.println("      Profit form child is " + profitFromChild);
        System.out.println("Total profit is " + totalProfit);
    }
}
