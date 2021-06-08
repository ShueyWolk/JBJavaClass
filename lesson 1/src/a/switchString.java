package a;

import java.util.Scanner;

public class switchString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mode: [ON, OFF, STANDBY]");
		String machineMode = sc.nextLine();
		sc.close();
		System.out.println(machineMode);

		switch (machineMode) {
		case "ON":
			System.out.println("Working");
			break;
		case "OFF":
			System.out.println("Not Working");
			break;
		case "STANDBY":
			System.out.println("SLEEPING ZZZZZ");
			break;
		default:
			System.out.println("The mode " + machineMode + "is not valid.");
			break;
		}
	}

}
