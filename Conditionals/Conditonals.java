package Conditionals;


/**
 * Write a description of class Conditonals here.
 *
 * @author aren
 * @version 16.2.24
 */
import java.util.Scanner;
public class Conditonals
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class Conditonals
     */
    public Conditonals()
    {
        // initialise instance variables
        Scanner keyboard;
        System.out.println("how many dogs do you have?");
        keyboard=new Scanner (System.in);
        int lotsOfDogs=keyboard.nextInt();
        if (lotsOfDogs>2 == true)
        System.out.println("you have a mighty lot of dogs");
        System.out.println("Woof");
        if (lotsOfDogs>2 == true)
        System.out.println("Are you happy with your dogs- type yes or no");
        boolean yes= keyboard.nextBoolean();
        if (yes) 
        System.out.println("Nice!");
        if (!yes) System.out.println("you mean asf");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
  
    
}
