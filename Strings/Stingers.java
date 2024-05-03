package Strings;
import java.util.Scanner;

/**
 * Write a description of class Stingers here.
 *
 * @author (aren)
 * @version (7.2.24)
 */
public class Stingers
{
    // instance variables - replace the example below with your own
    private int scan;
    private int scan2;

    /**
     * Constructor for objects of class Stingers
     */
    public Stingers()
    {
        // initialise instance variables
        System.out.println("Give me two words please");
        
        Scanner scan = new Scanner(System.in);
      
        Scanner scan2 = new Scanner(System.in);
        
        String choice;
        String str="";
        str = scan.next();
        String str2="";
        str2= scan2.next();
        
choice= scan.nextLine();
String s1,s2,s3,s4;
s1=str;
s2=str2;
s3=s1.concat(s2);
System.out.println(s3);
int length =str.length();
System.out.println(s2.charAt(length-1));
    }

}
