package task2;

public class Task2 {

	private static long number = 600851475143L;

	public static void main(String[] args) {
		long t = 2;
		while (t * t <= number) {
			if (number % t == 0) {
				number /= t;
			} else {
				t++;
			}
		}
		System.out.printf("Result is " + number);
	}
}
