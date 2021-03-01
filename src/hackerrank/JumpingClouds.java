package hackerrank;

public class JumpingClouds {

	static int jumpingOnClouds(int[] c) {
		int minJumps = 0;
		
		for (int i = 0; i < c.length;) {
			
			if (c[i] == 1) {
				i++;
				continue;
			}
			
			if (i < c.length -2 && c[i+1] == 0 && c[i+2] == 0) {
				minJumps++;
				
				i = i+2;
			} else if (i < c.length -1 && c[i] == 0 && c[i+1] == 0) {
				minJumps++;
				
				i = i+1;
			} else if (c[i] == 0) {
				
				if (i < c.length -1) {
					minJumps++;
				}
				
				i++;
			}
		}
		
		return minJumps;
    }
	
	public static void main(String[] args) {
		int[] array = new int[]{0, 1, 0, 0, 0,1,0};
		
		System.out.println(jumpingOnClouds(array));
	}
}
