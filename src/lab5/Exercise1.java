package lab5;

import java.util.Scanner;

class AgeException extends Exception {
	 
	 public AgeException(String message) {
	  super(message);
	 }
	}

public class Exercise1 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		
		try {
			if(age<16)
				throw new AgeException("Age of a person should be above 15");
			else
				System.out.println("Age : "+age);
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		
	}

}
