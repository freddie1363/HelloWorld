package test;

import java.util.Scanner;


class Sample {
	int price;
	String item;
	int qty;
	Sample() {} // 디폴트 생성자
	Sample(int price) {
		this.price = price;
		
	}
	Sample(int price, String item){
		this.price = price;
		this.item = item;
		
	}
}





public class SampleExe {
	
	public static void main(String[] args) {
//		Sample sample = null; // new Sample();
//		sample = new Sample(30, "apple");
//		
		Scanner scn = new Scanner(System.in);
		Sample[] samAry = new Sample[100];
		Sample sample = new Sample(30, "apple");
		samAry[0] = sample;
		
		int[] intAry = new int[10]; // 인트타입 10개 담을수있는거 선언
		System.out.println("메뉴선택1. 2. 3");
		int menu = scn.nextInt();
		scn.nextLine();
		System.out.println("다음선택1");
		scn.nextLine();
		System.out.println("다음선택2");
		scn.nextLine();
		
		
		cal("item", 3, 1000);
		
//		if (1 == 1 && 2 == 1) {
//			System.out.println("오류!!");
//			
//		}else {
//			double result = 4 / 3;
//			
//		}
		
		
		
	}
	
	static int cal(String a, int b, int c) {
		
		return 10;
		
	}

}
