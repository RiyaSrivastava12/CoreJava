package lab2;

class Exercise1 {

	static void getSecondSmallest(int arr[]) {
		int temp;
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 12, 24, 2, 89, 34, 45 };

		getSecondSmallest(arr);
		System.out.println("Second smallest number : " + arr[1]);

	}
}