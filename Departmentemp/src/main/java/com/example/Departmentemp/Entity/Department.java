package com.example.Departmentemp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  deptId;
	
	private String deptName;
	
	private String deptType;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(long deptId, String deptName, String deptType) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptType = deptType;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptType=" + deptType + "]";
	}
	
	
	

}
