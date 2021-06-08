package aaa;

import java.util.Scanner;

public class sevenBoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int top = sc.nextInt();
		sc.close();

		lbl: for (int i = 1; i <= top; i++) {
			// Find number that divides by 7
			if (i % 7 == 0) {
				System.out.println("Boom!!");
				continue;

			}
			// Find number that has the number 7 in it
			int x = i;
			while (x != 0) {
				if (x % 10 == 7) {
					System.out.println("Boom!!!");
					continue lbl;

				}
				x = x / 10;
			}
			System.out.println(i);
		}
	}

}
