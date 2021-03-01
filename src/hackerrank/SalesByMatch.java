package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

	public static void main(String[] args) {
		int n = 9;
		
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		
		System.out.println(sockMerchant(n, ar));
	}
	
	static int sockMerchant(int n, int[] ar) {
        
        Map<Integer, Integer> socksSameColor = new HashMap<Integer, Integer>(); 
        
        int pairs = 0;
        
        for (int i = 0; i < n; i++) {
            if (socksSameColor.containsKey(ar[i])) {
                socksSameColor.put(ar[i], socksSameColor.get(ar[i]) + 1);
            } else {
                socksSameColor.put(ar[i], 1);
            }
        }
        
        for (Integer key : socksSameColor.keySet()) {
            int pair = socksSameColor.get(key);
            	
            pairs += pair/2;
        }
        
        return pairs;
    }
}
