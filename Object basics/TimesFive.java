
/**
 * Write a description of class TimesFive here.
 *
 * @author aren
 * @version 15.2.24
 */
import java.util.Scanner;
public class TimesFive
{
    // instance variables - replace the example below with your own
    
    Coordinate point;
    Scanner keyboard;

    

    /**
     * Constructor for objects of class TimesFive
     */
    public TimesFive()
    {
        // initialise instance variables
        Scanner keyboard;
        System.out.println("enter two numbers to add them up");
        keyboard=new Scanner (System.in);
        int number=keyboard.nextInt();
        keyboard=new Scanner (System.in);
        int number2=keyboard.nextInt();
        System.out.println(number+number2);
    

    }
    
}
