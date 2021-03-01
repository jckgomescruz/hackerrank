package hackerrank;

import java.util.Scanner;

public class Day10_BinaryNumbers {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(consecutiveOnes(Integer.toBinaryString(n)));
        scanner.close();
    }
    
    static int consecutiveOnes(String binaryNumber) {
    	int maxConsecutiveOnes= 0;
    	int consecutiveOnes = 0;
    	
    	for (int i = 0; i < binaryNumber.length(); i++) {
    		if ('1' == binaryNumber.charAt(i)) {
    			consecutiveOnes++;
    		} else {
    			consecutiveOnes = 0;
    		}
    		
    		if (consecutiveOnes > maxConsecutiveOnes) {
    			maxConsecutiveOnes = consecutiveOnes;
    		}
    	}
    	
    	return maxConsecutiveOnes;
    }
}
