package classes.friend;

public class ComFriend extends Friend {
	private String company;
	private String dept;
	
	
	
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



	public ComFriend(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}



	public ComFriend(String company, String dept) {
		super();
		this.company = company;
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "ComFriend [company=" + company + ", dept=" + dept + "]";
	}
	
	
		
	}
	
	
	

