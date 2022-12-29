package lab_Sessions22_12_22;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder("");
		System.out.println("Enter your Name");
		sb.append(sc.nextLine());			
		sb.reverse();
		String str = sb.toString();
		
		System.out.println("After reversing  your Name :" +str.toUpperCase());
        sc.close();
	}	

}
