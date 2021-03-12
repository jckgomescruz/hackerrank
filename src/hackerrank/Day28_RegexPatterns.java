package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day28_RegexPatterns {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        Pattern p = Pattern.compile("[a-zA-Z]+@gmail.com");
        
        List<String> namesWithGmail = new ArrayList<String>();
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            
            Matcher m = p.matcher(emailID);
            
            if (m.find()) {
            	namesWithGmail.add(firstName);
            }
        }
        
        namesWithGmail.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        scanner.close();
    }
}
