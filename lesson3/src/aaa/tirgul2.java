package aaa;

import java.util.Arrays;
import java.util.Scanner;

public class tirgul2 {

	public static void main(String[] args) {

		String[] names = new String[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name: ");
			names[i] = sc.nextLine();
		}
		sc.close();
		System.out.println("The names are: " + Arrays.toString(names));

//		String[] fname = new String[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name: ");
//		fname[0] = sc.nextLine();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name: ");
//		fname[1] = sc.nextLine();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name: ");
//		fname[2] = sc.nextLine();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name: ");
//		fname[3] = sc.nextLine();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name: ");
//		fname[4] = sc.nextLine();

//		for (int i = 0; i < fname.length; i++) {
//			System.out.println(fname[i]);

		// fname[i] = sc.nextLine();//
	}

}
