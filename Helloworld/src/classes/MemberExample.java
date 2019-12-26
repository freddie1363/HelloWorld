package classes;

import java.util.Scanner;

public class MemberExample {
	static Member[] memberAry = new Member[3];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		execute();
	}
	

	public static void execute() {
		int cnt = 0, menu = 1;
		while (true) {
			System.out.println("============");
			System.out.println("1.생성2.조회3.리스트4.종료");
			System.out.println("============");
			System.out.println("선택>");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				searchMember();

			} else if (menu == 3) {
				listMember();
			} else if (menu == 4) {
				break;

			}

//			cnt++;
//			if (cnt == 3) {
//
//				break;
//
//			}

		}
		System.out.println("프로그램 종료.");

	}

	public static void searchMember() {
		System.out.println("id입력하세요.");
		String inputId = sc.nextLine();
		System.out.println("pw입력하세요.");
		String inputPw = sc.nextLine();

		for (Member mem : memberAry) {
			if (mem != null) {
				// id1) pw 1) 2) 2) 식으로 만들기
				if (inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println(mem);

				} else if (!inputId.equals(mem.getId()) && inputPw.equals(mem.getPassword())) {
					System.out.println("없는 id입니다.");
				} else if (inputId.equals(mem.getId()) && !inputPw.equals(mem.getPassword())) {
					System.out.println("비번 틀림");

				}

			}
		}
	}

	public static void listMember() {
		for (Member mem : memberAry) {
			if (mem != null) // 느낌표는 아니면이라는뜻
				System.out.println(mem);
		}
	}

	public static void createMember() {
		Member mem = new Member();
//		System.out.println("이름을 입력:");
//		String name = sc.nextLine();
//		mem.setName(name);
		System.out.println("id를 입력:");
		String id = sc.nextLine();
		mem.setId(id);
		System.out.println("pw를 입력:");
		String password = sc.nextLine();
		mem.setPassword(password);
//		System.out.println("age를 입력:");
//		int age = sc.nextInt();
//		mem.setAge(age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;

			}

		}

	}

}
