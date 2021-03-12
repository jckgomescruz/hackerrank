package hackerrank;

import java.util.Scanner;

public class Day29_Bitwise {

	private static final Scanner scanner = new Scanner(System.in);

	public static void maxBitWise(int n, int k) {
		int maxBitwise = 0;
		
		for (int i = 1; i < n; i++) {
			
			for (int j = i + 1; j <= n; j++) {
				int bitwise = i & j;
				
				if (bitwise > maxBitwise && bitwise < k) {
					maxBitwise = bitwise;
				}
			}
		}
		
		System.out.println(maxBitwise);
	}
	
    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            
            maxBitWise(n, k);
        }

        scanner.close();
    }
}
