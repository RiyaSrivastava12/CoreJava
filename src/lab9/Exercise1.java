//Write a lambda expression which accepts x and y numbers and return x^y.

package lab9;
import java.io.*;

@FunctionalInterface
interface Intfac1 {
	int powerOf(int num1, int num2);
}

public class Exercise1 {
	public static void main(String[] args) {

		Intfac1 refVar =(num2,num3) -> (int)Math.pow(num2, num3);
		System.out.println(refVar.powerOf(2,2));	
	}
}
