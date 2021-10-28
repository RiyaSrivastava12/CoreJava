package lab9;

@FunctionalInterface
interface Intfac8 {
	int fact(int num1);
}

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intfac8 res= num -> {
			  int result = num;
			  if (num == 0 || num == 1) 
			    return 1; 
			  while (num > 1) { 
			    num--;
			    result *= num;
			  }
			  return result;
		};
		System.out.println(res.fact(5));
	}

}
