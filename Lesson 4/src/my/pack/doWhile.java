package my.pack;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		// Do While
		int password = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		int input = sc.nextInt();

		while (input != password) {
			System.out.println("reenter password: ");
			input = sc.nextInt();
		}
		System.out.println("Welcome!");
		sc.close();
	}

}
