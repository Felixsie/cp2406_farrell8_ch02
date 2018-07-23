/**
 * Created by Lenovo on 7/19/2018.
 */

// This program will asks the user the number of Inches, then convert it into Feet.
import java.util.Scanner;

public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        final int INCHES_PER_FOOT = 12;
        int inches;
        int toFeet;
        int inchesLeft;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inches: ");
        inches = input.nextInt();
        toFeet = inches / INCHES_PER_FOOT;
        inchesLeft = inches % INCHES_PER_FOOT;
        System.out.println(inches + " inches is " +
                toFeet + " feet and " + inchesLeft + " inches");
    }
}
