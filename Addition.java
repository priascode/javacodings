package examples;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum = a + b;
		System.out.println("The Sum of two numbers is:"+ sum);
		
	}

}
