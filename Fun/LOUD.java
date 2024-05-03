package Fun;


/**
 * Write a description of class LOUD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LOUD
{
    // instance variables - replace the example below with your own
    private boolean loud;

    /**
     * Constructor for objects of class LOUD
     */
    public LOUD()
    {
        // initialise instance variables
        loud = false;
        while (loud)
        System.out.println("\007");
    }
}
