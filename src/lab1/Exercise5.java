package lab1;

public class Exercise5 {

	static int calculateSum(int n,int x,int y) {
		int sum = 0;

		int S1, S2, S3;
	     
        S1 = ((n / x)) * (2 * x + (n / x - 1) * x) / 2;
        S2 = ((n / y)) * (2 * y + (n / y - 1) * y) / 2;
        S3 = ((n / (x * y))) * (2 * (x * y)  + (n / (x * y) - 1) * (x * y))/ 2;
        
        sum = S1 + S2 + S3;
     
        return sum;
	}

	public static void main(String[] args) {
		int n = 6;
		int x=3, y=5;

		System.out.println(calculateSum(n,x,y));

	}

}
