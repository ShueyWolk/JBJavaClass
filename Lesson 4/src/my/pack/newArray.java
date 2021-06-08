package my.pack;

import java.util.Arrays;

public class newArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6 };
		int[] temp = new int[arr.length + 2];
//In order to copy one element less use 
		// System.arraycopy(arr, 0, temp, 0, arr.length - 1);
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;

		arr[3] = 50;
		arr[4] = 75;

		System.out.println(Arrays.toString(arr));
		// System.out.println(Arrays.toString(temp));
		//
	}

}
