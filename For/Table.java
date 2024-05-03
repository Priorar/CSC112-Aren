package For;


/**
 * Write a description of class Table here.
 *
 * @author aren
 * @version 11/4/24
 */
public class Table
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int z;

    /**
     * Constructor for objects of class Table
     */
    public Table()
    {
        // initialise instance variables
        boolean writing = true;
        boolean complete = true;
        int y = 0;
        int z = 1;
        int a = 2;
        int b = 3; 
        int c= 4;
        int d = 5;
        for (int x=y;x<6; x++) {
            System.out.print(x);
       }
        System.out.println();
       for (int x=z;x<7; x++) {
            System.out.print(x);
        }
          System.out.println();
       for (int x=a;x<8; x++) {
            System.out.print(x);
        }
           System.out.println();
       for (int x=b;x<9; x++) {
            System.out.print(x);
        }
           System.out.println();
       for (int x=c;x<10; x++) {
            System.out.print(x);
        }
           System.out.println();
       for (int x=d;x<11; x++) {
            System.out.print(x);
        }
    do{
        x++;
}while (complete);
}
}