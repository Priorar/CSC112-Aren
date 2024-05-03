package Advanced;
import java.util.Scanner;
/**
 * Write a description of class Advance here.
 *
 * @author (aren name)
 * @version (14.3.24)
 */
public class Advance
{
    // instance variables - replace the example below with your own
    private int scan;

    /**
     * Constructor for objects of class Advance
     */
    public Advance()
    {
        // initialise instance variables
        System.out.println("Give me two words please");
        Scanner scan = new Scanner(System.in);
        String choice;
        Scanner scan2 = new Scanner(System.in);
        String str="";
        String str2="";
        str = scan.next();
        str2 = scan.next();
        choice= scan.nextLine();
        String s1,s2,s3,s4,s5;
        s1=str;
        s2=str2;
        s2 = s2.toLowerCase();
        s1 = s1.toLowerCase();
        if (s1.equals(s2)) System.out.println("Same letters");
        else System.out.println("Not the same letters");
    }
}