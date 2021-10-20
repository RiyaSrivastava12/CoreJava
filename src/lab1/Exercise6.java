package lab1;

public class Exercise6 {

	public static int calculateDifference(int n) {

		int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;

		int sumN = (n * (n + 1)) / 2;

		int squareSumN = sumN * sumN;

		int sum = Math.abs(sumSquareN - squareSumN);

		return sum;
	}

	public static void main(String args[]) {
		int n = 3;
		System.out.println("Number: " + n);
		System.out.println("Difference: " + calculateDifference(n));
	}

}
