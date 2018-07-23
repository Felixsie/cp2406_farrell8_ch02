/**
 * Created by Lenovo on 7/19/2018.
 */

// This is a program is to get the number of eggs the user wnat to buy in a dozen.
// Then see if there any looses eggs.
// Calculate all of the egg's price.

import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
        final int EGGS_PER_DOZEN = 12;
        final double PRICE_PER_DOZEN = 3.25;
        final double PRICE_PER_EGG = 0.45;
        int eggs;
        int dozens;
        int leftOver;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numeber of eggs needed: ");
        eggs = input.nextInt();
        dozens = eggs / EGGS_PER_DOZEN;
        leftOver = eggs % EGGS_PER_DOZEN;
        total = dozens * PRICE_PER_DOZEN + leftOver * PRICE_PER_EGG;
        System.out.println("You ordered " + eggs + " eggs. That's " +
                dozens + " dozen at $" + PRICE_PER_DOZEN +
                " per dozen and " + leftOver + " loose eggs at " +
                (int) (PRICE_PER_EGG * 100) + " cents each for a total of $" + total);
    }
}
