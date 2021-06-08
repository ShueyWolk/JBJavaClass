package aaa;

import java.util.Arrays;

public class multiDemArray {

	public static void main(String[] args) {

		int[][] matrix = new int[4][10];

		matrix[3][9] = 0;
		for (int i = 0; i < matrix.length; i++) {
			// in order to fill up the array
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}
