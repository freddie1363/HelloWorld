package test;

import java.util.Scanner;

public class Test03 {
	private static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input name : ");
		String name = scn.nextLine();
		System.out.println("kor : ");
		int kor = scn.nextInt();
		System.out.println("eng : ");
		int eng = scn.nextInt();
		System.out.println("mat : ");
		int mat = scn.nextInt();
		
		int sum = kor + eng + mat;
		double avg = (double)sum / 3;
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + sum);
		System.out.printf("평균점수 : %.1f", avg);
		
		
		
		
		
		
		
		
		

//		public static void main(String[] args) throws IOException{
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//			String name = "";
//			int kor, eng, mat;
//			
//			System.out.print("Input name : ");	name = br.readLine();
//			System.out.print("kor : ");	kor = Integer.parseInt(br.readLine());
//			System.out.print("eng : ");	eng = Integer.parseInt(br.readLine());
//			System.out.print("mat : ");	mat = Integer.parseInt(br.readLine());
//			
//			int sum = kor + eng + mat;
//			double avg = (double)sum / 3;
//			
//			System.out.println("이름 : " + name);
//			System.out.println("합계점수 : " + sum);
//			System.out.printf("평균점수 : %.1f", avg);

	}

}
