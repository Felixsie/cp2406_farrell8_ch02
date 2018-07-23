/**
 * Created by Lenovo on 7/19/2018.
 */

//This Program is for users who want to buy food for them self and their children.

import java.util.Scanner;

public class ChiliToGo
{
    public static void main(String[] args)
    {
        final double ADULT_MEAL_PRICE = 7;
        final double CHILD_MEAL_PRICE = 4;
        int adultMeals;
        int childMeals;
        double totalPriceAdult;
        double totalPriceChild;
        double finalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of adult meals you want to order: ");
        adultMeals = input.nextInt();
        System.out.print("Enter the number of child meals you want to order: ");
        childMeals = input.nextInt();
        totalPriceAdult = adultMeals * ADULT_MEAL_PRICE;
        totalPriceChild = childMeals * CHILD_MEAL_PRICE;
        finalPrice = totalPriceAdult + totalPriceChild;
        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_MEAL_PRICE + " each.");
        System.out.println("      Total price is " + totalPriceAdult);
        System.out.println(childMeals + " child meals were ordered at " + CHILD_MEAL_PRICE + " each.");
        System.out.println("      Total price is " + totalPriceChild);
        System.out.println("Final price for all meals is " + finalPrice);
    }
}
