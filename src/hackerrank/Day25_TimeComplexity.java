package hackerrank;

import java.util.Scanner;

public class Day25_TimeComplexity {

	static boolean isPrime(int num) {
		int sqrtNum = (int) Math.sqrt(num);
		
		if (num == 1)
			return false;
		for (int i = 2; i <= sqrtNum; i++)
			if (num % i == 0)
				return false;
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (isPrime(sc.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }

		sc.close();
	}
}
