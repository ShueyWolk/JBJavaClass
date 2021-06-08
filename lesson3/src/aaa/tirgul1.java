package aaa;

public class tirgul1 {

	public static void main(String[] args) {
		int[] nums = new int[25];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			int r = (int) (Math.random() * 70);
			/*
			 * Create a random value and put the value into the array
			 */
			nums[i] = r;
			sum += nums[i];
			System.out.println(nums[i]);

		}
		System.out.println("========");
		System.out.println(sum);
	}

}
