
package lab1;

class Exercise1 {

	public static int sumOfCube(int n) {
		int sum = 0;
		for (int x = 1; x <= n; x++)
			sum += x * x * x;
		return sum;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfCube(n));

	}
}