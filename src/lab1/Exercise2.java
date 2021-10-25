/**
 * a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons.
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console 
 */
package lab1;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		// Scanner class is used to get user input
		String st = sc.next();
		//close() method closes this scanner
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
