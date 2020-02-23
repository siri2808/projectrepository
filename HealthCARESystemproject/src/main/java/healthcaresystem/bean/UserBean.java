package healthcaresystem.bean;

import java.util.Random;

public class UserBean {
	private String userid;
	private String password;
	private String username;
	private long mobile;
	private String mail;
	private String gender;
	private int age;
	private String userrole;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	@Override
	public String toString() {
		return "UserBean [userid=" + userid + ", password=" + password + ", username=" + username + ", mobile=" + mobile
				+ ", mail=" + mail + ", gender=" + gender + ", age=" + age + ", userrole=" + userrole + "]";
	}
	
	public UserBean()
	{
		super();
	}
	public UserBean(String userid, String password, String username, long mobile, String mail, String gender,
			int age, String userrole) {
		Random r=new Random();
		this.userid=userid;
		this.password=password;
		this.username=username;
		this.mobile=mobile;
		this.mail=mail;
		this.gender=gender;
		this.age=age;
		this.userrole=userrole;

	}
	
}
