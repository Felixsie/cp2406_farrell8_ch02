/**
 * Created by Lenovo on 7/15/2018.
 */
import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;
        int quartsNecessary = 18;
        int gallonsNecessary;
        int extraQuartsNecessary;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quarts needed >> ");
        quartsNecessary = input.nextInt();
        gallonsNecessary = quartsNecessary / QUARTS_IN_GALLON;
        extraQuartsNecessary = quartsNecessary % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNecessary +
                " quarts requires " + gallonsNecessary + " gallons plus " +
                extraQuartsNecessary + " quarts.");
    }
}
