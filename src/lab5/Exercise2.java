package lab5;

import java.util.Scanner;

class NameException extends Exception {
	public NameException(String message) {
		super(message);
	}
}

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name : ");
		String lastName = sc.nextLine();
		

		try {
			if (firstName.isEmpty() && lastName.isEmpty())
				throw new NameException("First Name and Last Name is blank !!!!");
			else

				System.out.println("First Name : " + firstName + "   Last Name : " + lastName);
		} catch (NameException e) {
			System.out.println(e);
		}
	}

}
