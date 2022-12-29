package lab_Sessions22_12_22;

import java.util.*;

public class InputFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // using scanner for input
		System.out.println("Enter your Name");
		String s1 = sc.nextLine();           // storing s1 value
		System.out.println("Confirm your Name");
		String s2 = sc.nextLine();
		
       if(s1.equals(s2)) { // comparing both value using equals 
    	   System.out.println("cangrats!!");
       } else {
    	   System.out.println("Name Does'nt match, please try again");
       }
       sc.close(); //closing scanner class
       }

}
