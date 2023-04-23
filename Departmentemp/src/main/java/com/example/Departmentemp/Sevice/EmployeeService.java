package com.example.Departmentemp.Sevice;

import java.util.List;
import java.util.Optional;

import com.example.Departmentemp.Entity.Employee;
import com.example.Departmentemp.Entity.Registration;

public interface EmployeeService {

	public void save(Employee emp);

	public Optional<Employee> getId(String id);

	public void deleteEmployee(String id);

	public List<Employee> getAllEmployee();

	public void saveRegistrationDetail(Registration registration);

	public String getemail(String email, String password);
	
	
}
