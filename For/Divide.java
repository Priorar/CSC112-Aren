package For;
import java.util.Scanner;

/**
 * Write a description of class Divide here.
 *
 * @author Aren
 * @version 11/4/24
 */
public class Divide
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int z;
    /**
     * Constructor for objects of class Divide
     */
    public Divide()
    {
        // initialise instance variables
        boolean writing = true;
        x = 0;
        y = 7;
        z = 5;
    do{
    x++;
    if (x % z == 0)
    System.out.print("***");
            if (x % y == 0)
        System.out.println(x);
       if ( x > 100)
       writing = false;
    }while (writing);
}
}