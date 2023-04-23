package com.example.Departmentemp.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Departmentemp.Entity.Employee;

public interface EmployeeDAo extends JpaRepository<Employee, Long>{

}
