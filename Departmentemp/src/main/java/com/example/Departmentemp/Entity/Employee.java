package com.example.Departmentemp.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empId;
	
	private String empName;
	private double empSalary;
	private int age;
	
	  @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL)
	 @JoinColumn(name = "deptId")
	private Department department;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long empId, String empName, double empSalary, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.age = age;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", age=" + age + "]";
	}
	
	
	

}
