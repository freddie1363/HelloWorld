package common;

public class GarbageValueExample {
	public static void main(String[] args) {
		int var1 = 125; // 2,123,483,647
		byte var2 = 125; // 127
		
		for(int i = 0; i<10; i++) { // 10번 반복,
			var1 = var1 + 1;
			var2 = (byte)(var2 + 1); // int -> byte 형변환(casting)
			System.out.println("var1 : " + var1 + ", " + "var2 : " + var2);
		}
	}

}
