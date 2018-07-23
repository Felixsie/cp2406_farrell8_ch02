/**
 * Created by Lenovo on 7/15/2018.
 */

// This program is to ask user the number of Nautical Mile and convert it to KM and Miles.

import java.util.Scanner;

public class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
        final double KM_PER_NAUTICAL_MILE = 1.852;// This program is to convert Nautical Mile to KM and Miles.
        final double MILES_PER_NAUTICAL_MILE = 1.150779;
        double nauticalMiles;
        double toKm;
        double toMiles;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of nautical miles: ");
        nauticalMiles = input.nextDouble();
        toKm = nauticalMiles * KM_PER_NAUTICAL_MILE;
        toMiles = nauticalMiles * MILES_PER_NAUTICAL_MILE;
        System.out.println(nauticalMiles + " nautical miles equals " +
                toKm + " kilometers or " + toMiles + " miles.");
    }
}
