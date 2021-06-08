package a;

public class evenNum {

	public static void main(String[] args) {
		int x = (int) (Math.random() * 11);

		for (int i = 0; i <= x; i += 2) {
			System.out.println(i + ", ");
		}
	}

}
