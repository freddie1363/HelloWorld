package classes;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("예담IT", "940101", "김철수");
		Person p2 = new Person("예담HQ", "940202", "박수진");
		Person p3 = new Person("예담HR", "940303", "이수정");
		Person[] perAry = new Person[3];
		perAry[0] = p1;
		perAry[1] = p2;
		perAry[2] = p3;

		for (int i = 0; i < 3; i++) {
			perAry[i].introduce2();
		}
		System.out.println("=============");
		
		//확장 for
		for (Person p : perAry) {
			p.introduce2();
		}

	}

}
