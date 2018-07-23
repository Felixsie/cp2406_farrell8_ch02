/**
 * Created by Lenovo on 7/15/2018.
 */

// This program is to convert Nautical Mile to KM and Miles.

public class NauticalMiles
{
    public static void main(String[] args)
    {
        final double KM_PER_NAUTICAL_MILE = 1.852;
        final double MILES_PER_NAUTICAL_MILE = 1.150779;
        double nauticalMiles = 200;
        double toKm;
        double toMiles;
        toKm = nauticalMiles * KM_PER_NAUTICAL_MILE;
        toMiles = nauticalMiles * MILES_PER_NAUTICAL_MILE;
        System.out.println(nauticalMiles + " nautical miles equals " +
                toKm + " kilometers or " + toMiles + " miles.");
    }
}
