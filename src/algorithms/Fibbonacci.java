package algorithms;

public class Fibbonacci {
	static int currentVal = 0;
	static int previousVal = 1;

	static int temp2 = 0;

	public static void main(String[] args) {
		// iterativeFibbonacci();
		recursiveFibbonacci(10);
	}

	private static void iterativeFibbonacci() {
		int temp = 0;
		while (currentVal <= 10) {
			temp = previousVal;
			previousVal += currentVal;
			currentVal = temp;
			System.out.println(currentVal);
		}
	}

	private static void recursiveFibbonacci(int max) {
		while (max != 0) {
			max--;
			temp2 = previousVal;
			previousVal += currentVal;
			currentVal = temp2;
			System.out.println(currentVal);
			recursiveFibbonacci(max);
		}
	}
}