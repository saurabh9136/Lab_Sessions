package lab_Session29_12_22;
import java.util.Scanner;

public class ExceptionHandlingEx {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // use to take input from user
        System.out.println("Enter the value of first number");
        int i=sc.nextInt();// storing input from user
        System.out.println("Enter the value of second number");
        int j=sc.nextInt();
        sc.close();// close the scanner class after use
        
        System.out.println("Values of variable before calculation i:"+i+" j:"+j);
        try { // use to handle Exception
        	System.out.println(i/j); // at some point it throw the exception so using try catch block
        }
        catch (Exception e) { // e print the exception identified by jvm
        	System.out.println(e);
        }
        System.out.println("calculation done");
	}
	
}
