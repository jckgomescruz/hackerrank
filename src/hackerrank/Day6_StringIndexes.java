package hackerrank;

import java.util.Scanner;

public class Day6_StringIndexes {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			String text = sc.nextLine();
			
			System.out.println(separateEvenOddIndexesValues(text));
		}

		sc.close();
	}
	
	private static String separateEvenOddIndexesValues(String text) {
		String evenIndexValues = "";
		String oddIndexValues = "";
		
		for (int i = 0; i < text.length(); i++) {
			Character letter = text.toCharArray()[i];
			
			if (i%2 == 0) {
				evenIndexValues += letter;
			} else {
				oddIndexValues += letter;
			}
		}
		
		return evenIndexValues + " " + oddIndexValues;
	}
}
