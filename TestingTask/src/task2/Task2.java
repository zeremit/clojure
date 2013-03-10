package task2;

public class Task2 {

	private static int first = 1;

	private static int previous = 2;

	private static int max = 4000000;

	public static void main(String[] args) {
		while (previous < max) {
			int t = previous;
			previous = previous + first;
			first = t;
		}
		System.out.printf("Result is " + previous);
	}
}
