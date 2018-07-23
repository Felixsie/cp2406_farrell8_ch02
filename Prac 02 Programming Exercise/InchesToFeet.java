/**
 * Created by Lenovo on 7/19/2018.
 */

// This program converts Inches to feet.

public class InchesToFeet
{
    public static void main(String[] args)
    {
        final int INCHES_PER_FOOT = 12;
        int inches = 86;
        int tofeet;
        int inchesLeft;
        tofeet = inches / INCHES_PER_FOOT;
        inchesLeft = inches % INCHES_PER_FOOT;
        System.out.println(inches + " inches is " +
                tofeet + " feet and " + inchesLeft + " inches");
    }
}
