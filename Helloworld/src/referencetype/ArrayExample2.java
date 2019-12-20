package referencetype;

public class ArrayExample2 {
	public static void main(String[] args) {

//		int[] num = new int[25];
//		for (int i = 0; i < 25; i++) {
//			num[i] = i + 1;
//			
//			
//		}
//		for (int i = 0; i < 25; i++) {
//			System.out.println(num[i] + " ");
//			
//		}
		int[] num = new int[25];
		int summary = 0;
		double avg = 0;
		System.out.println("배열의 크기:" + num.length);
		for (int i = 0; i < 25; i++) {
			num[i] = i+1;
			summary += num[i];
			avg=summary/num.length;

		}System.out.println(summary);
		System.out.println(avg);
		
		

	}
}
