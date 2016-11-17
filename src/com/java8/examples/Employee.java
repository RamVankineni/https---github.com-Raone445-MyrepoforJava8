package com.java8.examples;

public class Employee {

	private String eid;
	private String ename;
	
	public Employee(){
		super();
	}
	public Employee(String eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
}