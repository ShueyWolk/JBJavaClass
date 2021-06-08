package a;

public class randomValue {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 33);
		int b = (int) (Math.random() * 33);

		System.out.println("a = " + a + " and b = " + b);

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}

}
