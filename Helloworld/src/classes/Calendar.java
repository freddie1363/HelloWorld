package classes;

public class Calendar {
	public static void main(String[] args) {
		// 해당월의 날짜수, 월의 첫날(1일)의 시작요일.
		int month = 11;
		System.out.println("==========(" + month + "월)============");
//		System.out.println(getFirstDayofMonth(month));
//		System.out.println(getMaxDate(month));
		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(" " + weeks[i]);
		}
		System.out.println();
		System.out.println("============================");
		int spaceCnt = 0;
		for (int i = 1; i < getFirstDayofMonth(month); i++) {
			System.out.print("");
			spaceCnt++;
		}

		// 7일 단위로 출력.
		for (int i = 1; i <= getMaxDate(month); i++) {
//			System.out.print(i + " ");
			System.out.printf("%4d", i);
			if (i % 7 == 0)
				System.out.println();
		}

	}

	public static int getFirstDayofMonth(int month) {
		int result = 0;
		if (month == 9) {
			result = 1;
		} else if (month == 10) {
			result = 3;
		} else if (month == 11) {
			result = 6;
		} else if (month == 12) {
			result = 1;
		}
		return result;

	}

	public static int getMaxDate(int month) {
		// 1월 31일
		// 2월 28일
		// 3월 31일
		// 4월 30일
		// 5월 31일
		// 6월 30일
		// 7월 31일
		// 8월 31일
		// 9월 30일
		// 10월 31일
		// 11월 30일
		// 12월 31일

		int dayCnt = 0;
		if (month <= 7) {
			if (month % 2 == 1) {
				dayCnt = 31;
			} else if (month == 2) {
				dayCnt = 28;
			} else {
				dayCnt = 30;
			}
		} else {
			if (month % 2 == 0) {
				dayCnt = 31;

			} else {
				dayCnt = 30;
			}

		}
		return dayCnt;

	}
}
