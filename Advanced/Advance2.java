package Advanced;

import java.util.Scanner;
/**
 * Write a description of class Advance2 here.
 *
 * @author aren
 * @version 14.3.24
 */
public class Advance2
{
    // instance variables - replace the example below with your own
    private int scan;
    private int scan2;
    private int Interger;

    /**
     * Constructor for objects of class Advance2
     */
    public Advance2()
    {
        // initialise instance variables
       System.out.println("Give me two numbers please");
       Scanner scan =new Scanner(System.in);
       String str=scan.nextLine();
       System.out.println(""+str);
        Scanner scan2 =new Scanner(System.in);
       String str2=scan.nextLine();
       System.out.println(""+str2);
    int 
    num=Integer.parseInt(str);
    int 
    num2=Integer.parseInt(str2);
    num++;
    num2++;
    int num3 = num2 + num; 
    System.out.println("is "+num3);
    
    
    }
}
