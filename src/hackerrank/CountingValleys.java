package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {

	public static int countingValleys(int steps, String path) {
		int valleys = 0;

		int seaLevel = 0;
		int currentLevel = 0;

		if (steps >= 2 && steps <= Math.pow(10.0, 6.0)) {

			boolean achieveUnderLevelSea = false;
			for (Character step : path.toCharArray()) {
				
				if (step == 'D') {
					currentLevel--;
				}
				
				if (step == 'U') {
					currentLevel++;
				}
				
				if (currentLevel < 0) {
					achieveUnderLevelSea = true;
				}
				
				if (achieveUnderLevelSea && currentLevel == seaLevel) {
					valleys++;
					achieveUnderLevelSea = false;
				}
			}
		}

		return valleys;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int steps = Integer.parseInt(bufferedReader.readLine().trim());

		String path = bufferedReader.readLine();

		int result = countingValleys(steps, path);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
