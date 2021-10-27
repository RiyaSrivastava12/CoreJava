/**
 * Create a method which accepts an array of numbers and 
 * returns the numbers and their squares in Hashmap
 */
package lab6;

import java.util.HashMap;
import java.util.Iterator;

public class Exercise3 {
	public static HashMap getSquares(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Accepts an array of numbers and return their squares
		for (int n : array) {
			map.put(n, n * n);
		}
		return map;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		HashMap<Integer, Integer> map = getSquares(array);

		// Iterate through the list
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
