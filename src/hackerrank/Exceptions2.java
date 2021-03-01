package hackerrank;

import java.util.Scanner;

class Calculator {
	int power (int n, int p) throws Exception {
		Double n1 = new Double(n);
		Double n2 = new Double(p);
		
		if (n1 < 0 || n2 < 0) {
			throw new Exception("n and p should be non-negative");
		}
		
		return (int) Math.pow(n1, n2); 
	}
}

public class Exceptions2 {

	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
