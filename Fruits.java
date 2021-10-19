package examples;

import java.util.Scanner;
public class Fruits {

	public static void main(String[] args) {
		System.out.println("Enter your choice");
		Scanner Sc =new Scanner(System.in);
		int choices = Sc.nextInt();
		switch(choices) {
		case 1:
			System.out.println("Apple");
			break;
		// TODO Auto-generated method stub
		case 2:
			System.out.println("Banana");
			break;
		case 3:
			System.out.println("Guava");
			break;
		case 4:
			System.out.println("Mango");
			break;
		case 5:
			System.out.println("None");
			break;
		}
	}
}