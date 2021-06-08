package aaa;

import java.util.Arrays;

public class tirgul3 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = { 2, 4, 6, 8 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println("___________________");

		int[][] arrDim = { { 1, 1, 1 }, { 2, 2, 2, 2, 2, }, { 3, 3, 3 } };
		for (int i = 0; i < arrDim.length; i++) {
			System.out.print(Arrays.deepToString(arrDim));
			System.out.print("===================");
			System.out.print(Arrays.toString(arrDim[i]));
		}

	}

}
