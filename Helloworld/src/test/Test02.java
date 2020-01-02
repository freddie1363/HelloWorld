package test;

import java.util.Scanner;

public class Test02 {
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("0~100 점수값을 정수로 입력하세요 ");
		int data = scn.nextInt();
		if (data < 0 || data > 100) {
			System.out.println("입력오류!!");

		} else {
			System.out.println("입력된값 : " + data);
		}

	}

}
