package referencetype;

public interface ArrayInArrayExample2 {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int m = 1;
		for (int a = 0; a < 5; a++) {
			for (int k = 0; k < 5; k++) {
				intAry[a][k] = m++;
				
				System.out.print(intAry[a][k]+ " ");
				
			

			}
			System.out.println();
			
			
			
		}
		
			}
			

		

	}

