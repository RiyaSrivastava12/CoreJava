//Program to find the sum of the cubes of the digits of an n digit number
package lab1;

class Exercise1 {

	public static int sumOfCube(int n) {
		int sum = 0;
		
		//loop for adding cube of 5 to sum
		for (int x = 1; x <= n; x++)
			sum += x * x * x;
		return sum;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sumOfCube(n));

	}
}