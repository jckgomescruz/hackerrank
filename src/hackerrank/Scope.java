package hackerrank;

import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	public Difference(int[] elements) {
  		this.elements = elements;
  	}
  	
  	void computeDifference() {
  		for (int i = 0; i < elements.length - 1; i++) {
  			for (int j = 1; j < elements.length; j++) {
  				int val1 = elements[i];
  				int val2 = elements[j];
  				
  				int diff = Math.abs(val2 - val1);
  	  			
  	  			if (diff > maximumDifference || i == 0 && j == 0) {
  	  				maximumDifference = diff;
  	  			}
  			}
  		}
  	}

} // End of Difference class

public class Scope {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
