package org.jsp.springdemo;

public class Employee {
	private String desg;
	private double sal;
	
	public Employee(double sal,String desg) {
		this.sal=sal;
		this.desg=desg;
	}
	public Employee() {
		
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
}
