package classes.extendpkg;

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.method1();
		parent.method2();
		//parent.method3(); // 부모클래스의 정의되지 않아 사용불가능
		
		Child child = (Child) parent; // 강제형변환,
		child.field2 = "data2";
		child.method3();
		
		
		Parent parent2 = new Parent(); // 강제형변환,
		if (parent2 instanceof Child) {
			Child child2 = (Child) parent2;
			child2.method3();
			
		}else {
			System.out.println("형변환 할 수 없습니다.");
		}
		
		Object obj = new Parent();
		

		
		
	}

}
