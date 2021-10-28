/**
 * Create a method which accepts an array of integer elements and return the second smallest element in the array.
 */
package lab6;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Exercise5 {
      
       public int getSecondSmallest(int[] arr){
              List<Integer> al = new ArrayList<Integer>();
              for(int i: arr){
                     al.add(i);
              }
              //sorting array element.
              Collections.sort(al);
              //using get() to access 
              return al.get(1);
       }
    
       public static void main(String[] args) {
    	      Exercise5  p = new Exercise5();
    	      //Initializing an Array of integers
              int arr[] = {10,14,5,20,12,15};
              // calling getSecondSmallest method and passing an array to it
              int i = p.getSecondSmallest(arr);
              System.out.println("Second Smallest element in the array : "+i);
       }

}

