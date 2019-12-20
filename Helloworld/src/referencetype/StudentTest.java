package referencetype;

import java.util.Scanner;

public class StudentTest {
	//학생 성적 관리프로그램 만들기//
	//배열5개짜고 학생 성적 원하는수만큼 집어넣어서 1.입력 2.합계 3.평균 4.종료//
	public static void main(String[] args) {
		boolean run = true;
		int[] num = new int[5];
		int balance = 0, menu = 0;
		int summary = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("---------------");
			System.out.println("1.입력 2.합계 3.평균 4.종료");
			System.out.println("---------------");
			System.out.println("선택>");
			menu = scanner.nextInt();
			if(menu==1) {
				System.out.println("입력>");
				for (int i = 0; i < 5; i++) {
					num[i]=scanner.nextInt();
					num[i+1]=scanner.nextInt();
					num[i+2]=sccanner.nextInt();
					num[i+3]=sccanner.nextInt();
					num[i+4]=sccanner.nextInt();
					
				}
//					
				
				
				
				
				
			} else if(menu==2) {
				System.out.println("합계>");
				
			}else if(menu==3) {
				System.out.println("평균>");
				

		
			}else if(menu==4) {
		
			run = false;
		}
	}
		System.out.println("프로그램 종료");
	}

}
