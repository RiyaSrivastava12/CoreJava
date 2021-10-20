package lab1;

class Exercise3 {

	static void Fibonacci(int num) {
		int num1 = 0, num2 = 1;

		int counter = 0;

		while (counter < num) {

			System.out.print(num1 + " ");

			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}

	}

	static int fib(int n) {

		if (n <= 1)
			return n;

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[]) {

		int num = 10;
		Fibonacci(num);

		System.out.println();
		System.out.println("Using recursion :- ");

		for (int i = 0; i < num; i++) {

			System.out.print(fib(i) + " ");
		}
	}
}
