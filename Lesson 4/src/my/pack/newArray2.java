package my.pack;

import java.util.Arrays;

public class newArray2 {

	public static void main(String[] args) {
//Create an array with 10 byte elements
		byte[] arr1 = new byte[10];
		arr1[0] = 2;
		arr1[5] = 3;
		arr1[9] = 4;

		System.out.println(Arrays.toString(arr1));

		// create an array of 3 string elements
		// Static initialization
		String[] arr2 = { "aaa", "bbb", "ccc" };
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2[2]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[0]);

		// Create an array of char elements
		char[] characters = { 'A', 'b', 'ò', '"', '\n', '\\', 65 };
		System.out.println(Arrays.toString(characters));
	}

}
