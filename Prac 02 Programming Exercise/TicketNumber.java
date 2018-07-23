/**
 * Created by Lenovo on 7/19/2018.
 */

// This Program is to check whether he ticket number is valid or not.

import javax.swing.JOptionPane;

public class TicketNumber
{
    public static void main(String[] args)
    {
        final int DIGIT_CHECK = 7;
        String ticket;
        int ticketNumber;
        int newTicketNumber;
        int lastDigit;
        int remainder;
        boolean result;
        ticket = JOptionPane.showInputDialog(null,
                "Enter a 6-digit ticket number", "Ticket Number Dialog",
                JOptionPane.INFORMATION_MESSAGE);
        ticketNumber = Integer.parseInt(ticket);
        lastDigit = ticketNumber % 10; // gets last digit;
        newTicketNumber = ticketNumber / 10; //removes last digit
        remainder = newTicketNumber % DIGIT_CHECK;
        result = (remainder == lastDigit);
        JOptionPane.showMessageDialog(null,"The ticket number you entered is " +
                ticketNumber + ", it is last digit is " + lastDigit + " and remainder is " + remainder +
                ",\nso the result is " + result);
    }
}
