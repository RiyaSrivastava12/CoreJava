package lab2;

import java.util.Arrays;

public class Exercise2 {

	public static void main(String[] args) {
		
		String [] stringArray = {"red", "brown", "c", "0", "2", "mango", "cold"};
	    sortString(stringArray);

	}

	public static void sortString(String[] sArr)
	{
	    Arrays.sort(sArr);
	    System.out.println(Arrays.toString(sArr));
	}
}
