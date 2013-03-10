package task1;

public class Task1 {

	private static int first = 1;

	private static int previous = 2;

	private static int max = 4000000;

	public static void main(String[] args) {
		int summa = 0;
		do {
			int t = previous;
			if((t & (1))==0){
				summa += previous;
			}
			previous = previous + first;
			first = t;
		} while (previous < max);
		System.out.printf("Result is " + summa);
	}
}
