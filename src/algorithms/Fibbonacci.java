package algorithms;

public class Fibbonacci {
	static int currentVal = 0;
	static int previousVal = 1;

	static int temp2 = 0;

	public static void main(String[] args) {
		// iterativeFibbonacci();
		recursiveFibbonacci(1000);
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

	private static void recursiveFibbonacci(int i) {
		while (i != 0) {
			i--;
			recursiveFibbonacci(i);
			temp2 = previousVal;
			previousVal += currentVal;
			currentVal = temp2;
			System.out.println(currentVal);
		}
	}

}
