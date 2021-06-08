package my.pack;

import java.util.Scanner;

public class doWhile2 {
	public static void main(String[] args) {
		// Do While Post Test
		int password = 123;
		Scanner sc = new Scanner(System.in);
		int input = 123;

		do {
			System.out.println("Enter password: ");

		} while (input != password);

		System.out.println("Welcome!");
		sc.close();
	}

}
