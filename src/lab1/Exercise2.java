package lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		switch (st) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("ready");
			break;
		case "green":
			System.out.println("go");
			break;
		default:
			System.out.println("");
		}
	}

}
