package model;

//Type your code here
public class User{
	public String name;
	String email;
	String date;
	String gender;
	
	public User(String name,String gender, String date) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
		
		this.date = date;
	
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return date;
	}
	public String setDob(String date) {
		return this.date = date;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}


}  