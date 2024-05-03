package PrimitaveVariables;

 


/**
 * Write a description of class PrimitiveVariables here.
 *
 * @author aren
 * @version 8/2/24
 */
public class PrimitiveVariables
{
    // instance variables - replace the example below with your own
    private int Primitive;
    private long Longer;
    private float Floating;
    private boolean Skyred;
    private char letter = 'g';
    
    
    

    /**
     * Constructor for objects of class PrimitiveVariables
     */
    public PrimitiveVariables()
    {
        // initialise instance variables
        Primitive = 4+2;
        Longer = 4364343244552354l;
        Floating = 3.1f;
        Skyred=false;
        letter = 'g';
        System.out.println(Primitive);
        System.out.println(Longer);
        System.out.println(Floating);
        System.out.println(Skyred);
        System.out.println(letter = 'g');
        java.awt.Toolkit.getDefaultToolkit().beep();
        System.out.println("\007");

        }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return Primitive + y;
        
        
    }
  
    }



