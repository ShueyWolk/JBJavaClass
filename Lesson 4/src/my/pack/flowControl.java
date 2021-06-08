package my.pack;

public class flowControl {

	public static void main(String[] args) {
//IF construct
		int x = 17;
		if (x >= 10) {
			System.out.println("ten");
		} else {
			System.out.println("other amount");
		}

		// Switch Construct
		switch (x) {
		case 10:
			System.out.println("ten");
			break;
		case 20:
			System.out.println("twenty");
			break;
		default:
			System.out.println("other");
		}
		// While loop
		int c = 10;

		while (c <= 15) {
			System.out.print("*");
			c++;
			break;

		}
		System.out.println();
		// For loop
		for (int i = 0; i <= 5; i++) {
			System.out.print("+");
		}
		System.out.println();
		// For Each loop
		String[] arr = { "a", "bb", "ccc", "dddd", "eeeee", "ffffff", "gggggg" };

		for (String e : arr) {
			System.out.println(e);
			if (e.length() == 5) {
				break;
			}

		}
	}

}
