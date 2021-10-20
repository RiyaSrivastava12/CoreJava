package lab1;

import java.util.Scanner;

public class Exercise8 {
	private static boolean checkNumber(int n) {

		if (n % 2 != 0) {
			return false;
		} else {

			for (int i = 0; i <= n; i++) {

				if (Math.pow(2, i) == n)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(checkNumber(n));
		in.close();

	}
}
