/**
 * Java program that prompts the user for an integer and 
 * then prints out all the prime numbers up to that Integer
 */
package lab1;

import java.util.Scanner;

class Exercise4 {
	public static void main(String args[]) {
		int num, count;
		//// Scanner class is used to get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		sc.close();
		
		System.out.println("Prime numbers :-");
	
		for (int i = 2; i <= num; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
