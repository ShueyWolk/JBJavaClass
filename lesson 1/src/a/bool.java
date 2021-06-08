package a;

public class bool {

	/*
	 * public static void main(String[] args) { int r = (int)(Math.random()*11);
	 * System.out.println(r);
	 * 
	 * if (r > 6) { System.out.println("BIG"); } else if (r < 4) {
	 * System.out.println("small"); } else { System.out.println("It's number 5!"); }
	 * }
	 */
	public static void main(String[] args) {

		/*
		 * int grade = (int) (Math.random() * 11); System.out.println(grade);
		 * 
		 * if (grade < 6) { System.out.println("fail"); } else if (grade == 6) {
		 * System.out.println("pass"); } else if (grade <= 9) {
		 * System.out.println("good"); } else { System.out.println("WOW!!"); }
		 */
		int day = (int) (Math.random() * 7) + 1;
		System.out.println(day);

		switch (day) {
		case 1:
			System.out.println("Sun");
			break;

		case 2:
			System.out.println("Mon");
			break;

		case 3:
			System.out.println("Tues");
			break;

		case 4:
			System.out.println("Wed");
			break;

		case 5:
			System.out.println("Thurs");
			break;

		case 6:
			System.out.println("Fri");
			break;

		case 7:
			System.out.println("Sat");
			break;
		}

	}
}
