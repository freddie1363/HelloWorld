package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {
		
		
		
//		int sum = 0; // 1에서 10까지의합 구하기
//		for (int i = 1; i <= 10; i++) {
//			sum +=i;
//			sum = sum+i        1 2 3 4 5 6 7 8 9 10
//		}
//		System.out.println(sum);
		
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i%3==0) {
//				sum +=i;
//				
//			}
//			
//			
//		}
//		System.out.println(sum);
		
		
		//매스랜덤 써서 난수 *6+1 ==5 break만들기
		int num1;
		boolean run = true;
		while (run) {
			num1 = (int) (Math.random()*6)+1;
			System.out.println(num1);
			if(num1==5) {
				run = false;
			}
		}
		System.out.println("5가 나와서 종료합니다.");
	
		
		}
	
	
	
	
	
	}


