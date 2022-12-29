package lab_Sessions22_12_22;

import java.util.Scanner;

public class InputIfExist {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name");
			String s1 = sc.nextLine();
			System.out.println("Confirm your Name");
			String s2 = sc.nextLine();
			
	       if(s2.contains(s1)) {
	    	   System.out.println("Name already Exist");
	       } else {
	    	   System.out.println("entered values are diffrent");
	       }	
	       sc.close();
		}

}
