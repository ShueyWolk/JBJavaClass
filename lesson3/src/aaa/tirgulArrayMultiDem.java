package aaa;

import java.util.Scanner;

public class tirgulArrayMultiDem {

	public static void main(String[] args) {

		char[][] seats = new char[4][6];
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = '0';

			}

		}

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(" " + seats[i][j] + " ");
			}
			System.out.println();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = sc.nextInt() - 1;
		System.out.println("Enter seat: ");
		int seat = sc.nextInt() - 1;
		sc.close();

		seats[row][seat] = 'X';

		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.print(" " + seats[i][j] + "");

			}
			System.out.println();
		}
		System.out.println("Thank you!!");
	}

}
