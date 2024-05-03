
/**
 * Plotter. A small program that just makes a coordinate and then prints it out.
 *
 * @author aren
 * @version 14.2.24
 */
import java.util.Scanner; //keyboard input
public class Plotter
{
    // instance variables - replace the example below with your own
    Coordinate point; 
    Scanner keyboard;
    

    /**
     * Constructor for objects of class Plotter
     */
    public Plotter()
   
    {
        // initialise instance variables
        point = new Coordinate();
        point.x=5;
        point.y=7;
        System.out.println("Coordinate loaction is: "+point.x+","+point.y);
        keyboard=new Scanner (System.in);
        int number=keyboard.nextInt();
        System.out.println(number);
        
    }

    
}
