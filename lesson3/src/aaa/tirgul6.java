package aaa;

import java.util.Arrays;

public class tirgul6 {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 6, 8 };
		int[] arr2 = new int[arr1.length];

		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.print(Arrays.toString(arr1));
		System.out.print(Arrays.toString(arr2));
	}

}
