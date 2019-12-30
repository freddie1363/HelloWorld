package classes.friend;

public class Friend {
	private String name;
	private int phone;
	private String univ; //대학
	private String major; //전공
	private String company; //회사
	private String dept; //부서
	
	public Friend() {
		
	}

	public Friend(String name, int phone, String univ, String major, String company, String dept) {
		super();
		this.name = name;
		this.phone = phone;
		this.univ = univ;
		this.major = major;
		this.company = company;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", univ=" + univ + ", major=" + major + ", company="
				+ company + ", dept=" + dept + "]";
	}
	
	
	
	
	

}
