package Operators;
//
public class StringEqualsExample {
//	public static void main(String[] args) {
//		String strVar1 = "신민철";
//		String strVar2 = "신민철";
//		String strVar3 = new String("신민철");
//		
//		System.out.println( strVar1 == strVar2);
//		System.out.println( strVar1 == strVar3);
//		System.out.println();
//		System.out.println( strVar1.equals(strVar2));
//		System.out.println( strVar1.equals(strVar3));
//	}
//
//}

public static void main(String[] args) {
	int score = 85;
	char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C' ); 
	System.out.println(score + "점은 " + grade + "등급입니다.");
}
}