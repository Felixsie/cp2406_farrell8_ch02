/**
 * Created by Lenovo on 7/19/2018.
 */

//This Program is to promp the user to put the number of minutes and then converts it to number of hours and days.

import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        int minutes;
        double hours;
        double days;
        double MINUTES_PER_HR = 60;
        double HOURS_PER_DAY = 24;
        Scanner inputMinutes = new Scanner(System.in);
        System.out.print("Please enter the number of minutes: ");
        minutes = inputMinutes.nextInt();
        hours = minutes / MINUTES_PER_HR;
        days = hours / HOURS_PER_DAY;
        System.out.println("You entered " + minutes + " minutes. It is equals to " + hours + " hours or " + days + " days.");
    }
}
