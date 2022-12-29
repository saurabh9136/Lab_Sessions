package lab_Session29_12_22;
import java.util.*; // importing packages to use inbuilt classes

public class ThrowExceptionEx {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt(); // storing input from user in age
        sc.close(); // after using sc class close it
        
        if(age < 18) { // checking condition while age is less then 18
        	throw new ArithmeticException("Age is not correct, you are not eligible to vote!"); // using throw we generate own excption
        } else {
        	System.out.println("you are eligible to vote");
        }       
	}

}
