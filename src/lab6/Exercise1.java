/**
 *  Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 */
package lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise1 {
	
	//implementation of HashMap  
	Map<String, Integer> map = new HashMap<String, Integer>();
		
	//method to add elements in the HashMap  
	void createMap() {
		map.put("Parrot", 56);
		map.put("Dog", 100);
		map.put("Cat", 15);
		map.put("Wolf", 20);
		map.put("Deer", 5);
		System.out.println("Before sorting: ");
		printMap(map);
	}

	//sort elements by values  
	void sortByValue(boolean order) {
		//convert HashMap into List   
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());
		//sorting the list elements  
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if (order) {
					//compare two object and return an integer  
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());
				}
			}
		});
		
		//prints the sorted HashMap  
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		printMap(sortedMap);
	}

	//method for printing the elements  
	public void printMap(Map<String, Integer> map) {
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		System.out.println("\n");
	}
	//Main method - Execution start from here
	public static void main(String[] args) {
		Exercise1 sv = new Exercise1();
		sv.createMap();
		System.out.println("Sorting values in ascending order:");
		sv.sortByValue(true);
	}

}
