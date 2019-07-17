package pojo;

public class Student {
	private Integer stuid;
	private String name;
	private String pwd;
	private Integer age;
	private String gender;
	
	
	public Student(String name, String pwd, Integer age, String gender) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.gender = gender;
	}
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", name=" + name + ", pwd=" + pwd + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
}
