//Write a method that uses lambda expression to accept username and password and return true or false
package lab9;

@FunctionalInterface
interface Intf3 {
	String validId(String name,String password);
}

public class Exercise3 {

	public static void main(String[] args) {
		
		Intf3 refVar6 =(name,password) -> {
			if (name=="Riya" && password=="1234") {
				return "true";
			} else {
				return "false";
			}
		};
		
		System.out.println(refVar6.validId("Riya","1234"));
	}
}
