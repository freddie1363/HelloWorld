package classes;

public class Person {
	// 필드
	String company;
	String personNo;
	String personName;
	
	int age;
	
	// 생성자
	Person() {
		
	}
	
	Person(String company, String personNo, String personName) {
		this.company = company;
		this.personNo = personNo;
		this.personName = personName;
		
	}
	
	void introduce2 () {
		System.out.println("회사는 " + company + "에 다니고 " + "생년월일은 " + personNo + " 이고 이름은 " + personName + " 입니다. " );
	}
	
	
	

}
