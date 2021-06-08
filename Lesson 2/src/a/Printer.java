package a;

public class Printer {

	public static void main(String[] args) {
		String part1 = "There will be ", part2 = " people for dinner.";
		int visitor = 5;
		// visitor = visitor + 2; This is another way to add to "visitor"
		System.out.println(part1 + (visitor + 2) + part2);

		{

		}

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		int sum = a + b;
		double avg = sum / 2d;
		int rem1 = a % 10;
		int rem2 = b % 10;
		int area = a * b; 

		System.out.println(a + " and " + b);
		System.out.println(sum);

		System.out.println((a + b) / 2);
		System.out.println(avg);
		System.out.println("The remainder of " + a + " divided by 10 is " + rem1);
		System.out.println("The remainder of " + b + " divided by 10 is " + rem2);
		System.out.println("The area of a triangle with A as the hight and B as the width is " + area);
	

	}

}
