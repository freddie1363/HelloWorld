package referencetype;

public class ArrayExample {
	public static void main(String[] args) {
		
		int[] num = new int[25];
		for (int i = 0; i < 25; i++) {
			num[i] = i + 1;
			
			
		}
		
		
		
		
		int[] intAry = { 1, 2, 3, 4, 5 }; // int intAry[]
		int sum = 0;
		for (int x=0; x<5; x++) {
			sum += intAry[x]; // sum = sum + i;
		}
		System.out.println("모든 수의 합계는 " + sum);
		System.out.println("----------");
			
			
			
			
				

		String[] strAry = { "Hello", "nice", "good", "wonderful" };
		for (int i = 0; i < 4; i++) {
			System.out.println(strAry[i]);

		}
		int[] ittAry = {10, 222, 33, 24, 55};
		int sum1 = 0;
		for (int y=0; y < 5; y++) {
			if (y % 2 ==0) // y값(자리번호)이 0,1,2,3,4가 있는데 2로 나눠서 나머지가 0인 자리번호는 0,2,4이고 그게 10,33,55다
				sum1 += ittAry[y];
		}
		System.out.println("---------");
		System.out.println("홀수자리에 있는 수의 합계는 " + sum1);
		
		
		
					
			
			
		}
	}
	



