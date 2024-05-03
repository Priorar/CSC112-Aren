package Switch;
import java.util.Scanner;

/**
 * Write a description of class ElseAndLogic here.
 *
 * @author (aren)
 * @version (7.3.24)
 */
public class ElseAndLogic
{
    // instance variables - replace the example below with your own
    private int people;
    Scanner keyboard;

    /**
     * Constructor for objects of class ElseAndLogic
     */
    public ElseAndLogic()
    {
        // initialise instance variables
        Scanner keyboard;
        System.out.println("can I have a number greater than or equal to zero and less than or equal to eight");
        keyboard=new Scanner (System.in);
        int people=keyboard.nextInt();
        switch (people){
        case 0:
            System.out.println("It's even");
        break;
        case 1:
            System.out.println("It's odd");
        break;
        case 2: System.out.println("It's even");
        break;
         case 3: System.out.println("It's odd");
        break;
         case 4: System.out.println("It's even");
        break;
         case 5: System.out.println("It's odd");
        break;
         case 6: System.out.println("It's even");
        break;
         case 7: System.out.println("It's odd");
        break;
         case 8: System.out.println("It's even");
        break;
        default:
            System.out.println("that's not what i ASKED for.");
        break;
          }
        }     }