package classes;

public class ComFriend extends Friend {
	private String Company;
	private String dept;
	
	
	
	public String getCompany() {
		return Company;
	}



	public void setCompany(String company) {
		Company = company;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}



	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		Company = company;
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "ComFriend [Company=" + Company + ", dept=" + dept + "]";
	}
	
	@Override
	public void introduce() {
		System.out.println("이름은: " + super.getName()
		+ " 연락처는: " + super.getPhone()
		+ " 회사 : " + Company + " 부서: " + dept );
		
	}
	
	
	
	

}
