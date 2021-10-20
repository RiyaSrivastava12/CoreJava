package lab1;

public class Exercise7 {

	public static boolean checkNumber(int n) {
		String check = String.valueOf(n);
		int length = check.length();
		for (int i = 0; i < length - 1; i++) {
			if (check.charAt(i) <= check.charAt(i + 1)) {
				continue;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 12345321;

		System.out.println(checkNumber(n));

	}

}
