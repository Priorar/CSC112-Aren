package Conditionals;


/**
 * Write a description of class NextBooleanPrac here.
 *
 * @author aren
 * @version 16.2.24
 */
import java.util.Scanner;
public class NextBooleanPrac
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class NextBooleanPrac
     */
    public NextBooleanPrac()
    {
        // initialise instance variables
        Scanner keyboard;
        System.out.println("enter true for plus and false for minus");
        keyboard=new Scanner (System.in);
        boolean truefalse=keyboard.nextBoolean();
        System.out.println("enter two numbers");
        keyboard=new Scanner (System.in);
        int number=keyboard.nextInt();
        keyboard=new Scanner (System.in);
        int number2=keyboard.nextInt();
        if (truefalse) 
        System.out.println(number+number2);
        if (!truefalse)
        System.out.println(number-number2);
        
    }

  
}
