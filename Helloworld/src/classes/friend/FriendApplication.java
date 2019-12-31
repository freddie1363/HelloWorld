package classes.friend;

import java.util.Scanner;

import classes.Account;


public class FriendApplication {
	private static Friend[] fArray = new Friend[100];
	private static UnivFriend[] univArray = new UnivFriend[100];
	private static ComFriend[] comArray = new ComFriend[100];
	
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.친구생성 | 2.조회 | 3.친구목록 | 4.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				createFriend();

			} else if (selectNo == 2) {
				findFriend();

			} else if (selectNo == 3) {
				friendList();

			} else if (selectNo == 4) {
				run = false;

			}
		}
		System.out.println("프로그램 종료");
	}

	// 친구생성하기
	static void createFriend() {
		System.out.println("1.대학교동창 | 2. 회사동료 | 3. 그외");
		System.out.println("------------------------------------------");
		System.out.println("선택>");
		int selectNo2 = scn.nextInt();
		scn.nextLine();

		if (selectNo2 == 1) {
			System.out.println("이름 입력:");
			String name = scn.nextLine();
			System.out.println("연락처 입력:");
			int phone = scn.nextInt();
			System.out.println("학교 입력:");
			String  = scn.nextLine();
			System.out.println("전공 입력:");
			String major = scn.nextLine();
			

			Friend friend = new Friend(name, univ);

			for (int i = 0; i < accountArray.length; i++) {
				if (accountArray[i] == null) {
					accountArray[i] = acnt;
					System.out.println("결과 : 계좌가 생성되었습니다.");
					break;

				}
			}

		} else if (selectNo2 == 2) {
			findFriend();

		} else if (selectNo2 == 3) {
			friendList();

		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	// 친구목록보기
	static void friendList() {
		for (Friend fend : friendArray) {
			if (fend != null) {
				System.out.println(fend);
			}
		}

	}

	// 예금하기
	static void deposit() {
		System.out.println("조회할 계좌 입력: ");
		String ano = scn.nextLine();
		System.out.println("입금할 금액 입력: ");
		int amount = scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalance(balance + amount);

	}

	// 출금하기
	static void withdraw() {
		System.out.println("조회할 계좌 입력: ");
		String ano = scn.nextLine();
		System.out.println("출금할 금액 입력: ");
		int amount = scn.nextInt();
		Account accnt = findAccount(ano);
		int balance = accnt.getBalance();
		accnt.setBalance(balance - amount);

	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	static Account findAccount(String ano) {
		Account accnt = null;
		for (Account acnt : accountArray) {
			if (acnt != null) { // null여부를 체크.
				if (ano.equals(acnt.getAno())) {
					accnt = acnt;
					break;
				}
			}
		}
		return accnt;

	}

}
