package a;

import 	java.util.Scanner;


public class Scan {


	public static void main(String[] args) {
//How to create user input
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter min ");
		int b = sc.nextInt();
		System.out.println("Enter max ");
		
		sc.close();
		
		
		System.out.println("range: " + a + " - " + b);

		int r = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println(r);
		
				
	
	
	
	}

}
