package referencetype;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] intAry = new int[5][4];
		
//		intAry[0][0] = 1;
//		intAry[0][1] = 2;
//		intAry[0][2] = 3;
//		intAry[0][3] = 4;
//		
//		intAry[1][0] = 5;
//		intAry[1][1] = 6;
//		intAry[1][2] = 7;
//		intAry[1][3] = 8;
		
		int num=1;
		for (int u = 0; u < 5; u++) {
			for (int i = 0; i < 4; i++) {
				intAry[u][i] = num++;
				
			}
			
		}
		for (int u = 0; u < 5; u++) {
			for (int i = 0; i < 4; i++) {
				System.out.println(intAry[u][i] + " ");
			}
		System.out.println();
		}
			
	}

}
