package test;

public class Test6 {
	public Test6() {
	}
	
	public Test6(int a, int b) {
		System.out.println("max : " + (a>b ? a : b));
	}
	
	public Test6(double a, double b) {
		System.out.println("max : " + (a>b ? a : b));
	}
	
	public Test6(char a, char b) {
		System.out.println("max : " + (a>b ? a : b));
	}
	
	public static void main(String[] args) {
		new Test6(10, 20);
		new Test6(12.4, 9.45);
		new Test6('Z', 'p');
	}
}


