package com.lti.junit;

public class Employee {
	private int empId;
	private String name;
	private int salary;
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public boolean equals(Object obj) {
		Employee emp=(Employee) obj;
		boolean status = false;
		if(this.name.equalsIgnoreCase(emp.name)
				&& this.empId== emp.empId
				&& this.salary==emp.salary) {
			status= true;
			
		}
		return status;
	}
public static String getEmpNameWithHighestSalary() {
	return "Raj";
	
	
}
public static Employee getHighestPaidEmployee() {
	
	return new Employee(1, "Raj", 15000);
}
public int hashCode() {
	return this.empId;
}
}
