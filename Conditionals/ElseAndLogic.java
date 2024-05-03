package Conditionals;
import java.util.Scanner;

/**
 * Write a description of class ElseAndLogic here.
 *
 * @author (aren)
 * @version (28.2.24)
 */
public class ElseAndLogic
{
    // instance variables - replace the example below with your own
    private int x;
    Scanner keyboard;

    /**
     * Constructor for objects of class ElseAndLogic
     */
    public ElseAndLogic()
    {
        // initialise instance variables
        Scanner keyboard;
        System.out.println("how many people are there?");
        keyboard=new Scanner (System.in);
        int people=keyboard.nextInt();
        int greeting=people%14;
        String starlight="$$$";
        if (people == 1) 
        System.out.println("tena koe");
        else if (people == 2) 
        System.out.println("tena korua");
        else 
        System.out.println("tena koutou");
          }
        }