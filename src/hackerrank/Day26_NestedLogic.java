package hackerrank;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Day26_NestedLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int retDay = sc.nextInt();
		int retMonth = sc.nextInt();
		int retYear = sc.nextInt();
		
		int dueDay = sc.nextInt();
		int dueMonth = sc.nextInt();
		int dueYear = sc.nextInt();
		
		LocalDate returnedDate = LocalDate.of(retYear, retMonth, retDay);
		LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);
		
		int fine = 0;
		
		if (returnedDate.isAfter(dueDate)) {
			Period period = Period.between(dueDate, returnedDate);
			
			if (period.getYears() > 0 || retYear - dueYear > 0) {
				fine = 10000;
			} else if (period.getMonths() > 0) {
				fine = 500 * period.getMonths();
			} else {
				fine = 15 * period.getDays();
			}
		}
		
		System.out.println(fine);
		
		sc.close();
	}
}
