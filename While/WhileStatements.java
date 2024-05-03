package While;


/**
 * Write a description of class WhileStatements here.
 *
 * @author aren
 * @version 1.3.24
 */
public class WhileStatements
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class WhileStatements
     */
    public WhileStatements()
    {
        // initialise instance variables
      boolean finished=true;
      int count= 0;
      int multi = count%5;
      boolean timefive=true;
      while (finished){
      count++;
      if(timefive = (count % 27) == 0)
      System.out.println(count);
      if(timefive = (count % 5) == 0)
      System.out.println(count);
      if (count > 81)
      finished=false;
    }
    
    
      }
    }

