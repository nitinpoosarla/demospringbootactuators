package com.nitin;

public class User 
{
	private String name;
	private String dept;
	private String sal;
	
	
	public User(String name, String dept, String sal) {
		super();
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	

}
