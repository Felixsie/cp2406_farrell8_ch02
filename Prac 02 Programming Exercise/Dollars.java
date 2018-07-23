/**
 * Created by Lenovo on 7/19/2018.
 */

//This program is to convert the value of Dollars entered into how many $20, $10, $5, and $1.

import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        int inputDollars;
        int twentyDollars;
        int tenDollars;
        int fiveDollars;
        int oneDollars;
        int amountLeft;
        final int TWENTY_DOLLAR = 20;
        final int TEN_DOLLAR = 10;
        final int FIVE_DOLLAR = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of dollars: ");
        inputDollars = input.nextInt();
        twentyDollars = inputDollars / TWENTY_DOLLAR;
        amountLeft = inputDollars - (twentyDollars * TWENTY_DOLLAR);
        tenDollars = amountLeft / TEN_DOLLAR;
        amountLeft = amountLeft - (tenDollars * TEN_DOLLAR);
        fiveDollars = amountLeft / FIVE_DOLLAR;
        amountLeft = amountLeft - (fiveDollars * FIVE_DOLLAR);
        oneDollars = amountLeft;
        System.out.println("$" + inputDollars + " converted to "	+ twentyDollars + " $20s, " + tenDollars +
                " $10s, " + fiveDollars + " $5s, and " + oneDollars + " $1s");
    }
}
