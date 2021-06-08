package aaa;

public class arrays {

	public static void main(String[] args) {

		// An array for int
		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 19;
		arr[2] = -13;
		arr[3] = 2;
		arr[4] = 77;

// An array for String
		String[] names = new String[3];
		names[0] = "Dan";
		names[1] = "Fred";
		names[2] = "Robert";

//Access the element
		System.out.println(arr[3]);
		System.out.println(names[1]);
//To find the last element in an array
		System.out.println(names[names.length - 1]);

	}

}
