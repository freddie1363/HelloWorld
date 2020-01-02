package test;

import java.util.Scanner;

import classes.Account;

public class SwimApplication {
	private static Swim[] swimArray = new Swim[100];
	private static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.회원추가 | 2.회원수정 | 3.회원삭제 | 4.회원리스트 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				createSwim();

			} else if (selectNo == 2) {
				altSwim();

			} else if (selectNo == 3) {
				delSwim();

			} else if (selectNo == 4) {
				swimList();

			} else if (selectNo == 5) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");
	}
	
	
	
	static void createSwim() {
		System.out.println("회원 ID 입력:");
		String memberId = scn.nextLine();
		System.out.println("사용자 입력:");
		String name = scn.nextLine();
		System.out.println("전화번호 입력:");
		String phone = scn.nextLine();

		Swim swim = new Swim(memberId, name, phone);

		for (int i = 0; i < swimArray.length; i++) {
			if (swimArray[i] == null) {
				swimArray[i] = swim;
				System.out.println("결과 : 회원이 생성되었습니다.");
				break;

			}
		}

	}

	
	static void altSwim() {
		
		System.out.println("수정할 회원의 ID를 입력하세요 "); 
		String memberId = scn.nextLine();
		System.out.println("이름을 무엇으로 수정하시겠습니까?");
		String reName = scn.nextLine();
		Swim swimm = findSwim(memberId);
		String name = swimm.getName();
		swimm.setName(reName);
		System.out.println("전화번호를 무엇으로 수정하시겠습니까?");
		String rePhone = scn.nextLine();
		String phone = swimm.getPhone();
		swimm.setPhone(rePhone);
		

	}
	
	static void delSwim() {
		System.out.println("삭제할 회원의 ID를 입력하세요 ");
		String memberId = scn.nextLine();
		
				
		
		String delName = null;
		Swim swimm = findSwim(memberId);
		String name = swimm.getName();
		swimm.setName(delName);
		
		String delPhone = null;
		String phone = swimm.getPhone();
		swimm.setPhone(delPhone);
		
		String delmemberId = null;			
		swimm.setMemberId(delmemberId);
		
		
		
		
		
		
	
	}
	
	
	//회원리스트
	static void swimList() {
		
		for (Swim swim : swimArray) {
			if (swim != null) {
				System.out.println(swim);
			}
		}

	}
	
	static Swim findSwim(String memberId) {
		Swim swimm = null;
		for (Swim swim : swimArray) {
			if (swim != null) { // null여부를 체크.
				if (memberId.equals(swim.getMemberId())) {
					swimm = swim;
				    break;
				}
			}
		}
		return swimm;

	}
	
	
	

	
	
	
	

}
