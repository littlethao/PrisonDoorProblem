
public class Solution {

	static int[] prisonArray = new int[1000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 0; x < prisonArray.length; x++) {
	         prisonArray[x] = 0;
	      }
		walk(3);
	}

	private static void walk(int guard) {
		int y = 0;
		
		for(y = 0 + guard; y < prisonArray.length; y = y + guard) {
			if (prisonArray[y] == 0) {
				prisonArray[y] = 1;
			} else {
				prisonArray[y] = 0;
			}
		}
		for (int i = 0; i < prisonArray.length; i++) {
	         System.out.println(prisonArray[i] + " ");
	      }
	}
}

