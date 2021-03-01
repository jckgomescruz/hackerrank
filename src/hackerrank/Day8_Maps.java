package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_Maps {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        Map<String, Integer> mapPhones = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mapPhones.put(name, phone);            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            
            if (mapPhones.containsKey(s)) {
            	System.out.println(s + "=" + mapPhones.get(s));
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}
