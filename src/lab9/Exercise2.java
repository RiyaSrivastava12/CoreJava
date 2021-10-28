/**
 * Write a method that uses lambda expression to format a given string, 
 * where a space is inserted between each character of string.   
 */
package lab9;

@FunctionalInterface
interface Intf2 {
	String wordSpace(String name);
}
public class Exercise2 {
	public static void main(String[] args) {
		
		Intf2 refVar2 = name -> name.replace(""," ");
		System.out.println(refVar2.wordSpace("CG"));
		
	}

}
