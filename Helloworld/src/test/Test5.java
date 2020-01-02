package test;

import java.util.Scanner;

public class Test5 {
	private static Scanner scn = new Scanner(System.in);

	public static void compute(String item, int qty, int price) {
		System.out.println("품명 : " + item);
		System.out.println("금액 : " + (qty * price) + "원");

	}

	public static void main(String[] args) {

		System.out.println("품명 : ");
		String item = scn.nextLine();
		System.out.println("수량 : ");
		int qty = scn.nextInt();
		System.out.println("단가 : ");
		int price = scn.nextInt();
		compute(item, qty, price);

	}

}
