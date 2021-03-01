package hackerrank;

import java.util.Scanner;

public class RecursiveFactorial {

	static int factorial(int n) {
		int result = 1;
		
		if (n <= 1) {
			return result;
		} else {
			return n * factorial(n - 1);
		} 
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.println(factorial(n));
		
		scanner.close();
	}
}
