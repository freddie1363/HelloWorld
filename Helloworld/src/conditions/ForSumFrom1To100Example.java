package conditions;

public class ForSumFrom1To100Example {
//	public static void main(String[] args) {
//		int sum = 0;
//		
//		for (int i = 1; i <=100; i++) {
//			sum = sum+i;
//		}
//		
//		System.out.println("1~100 합 :" + sum);
//		}
//		}
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)  // 2로 나눴을때 나머지가 1이면 홀수, 0 이면 짝수
				sum = sum + i;
		}	
		System.out.println("1에서 100까지 홀수 합은(1)" + sum);

		
//		int sum = 0;
//		for (int i =1; i <= 100; i += 2) {
//			sum += i;
//		}
//		System.out.println("1에서 100까지 홀수 합은(2) + sum);
//	}
		}

	}

