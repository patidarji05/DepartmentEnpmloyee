package com.example.Departmentemp.SeviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Departmentemp.Dao.EmployeeDAo;
import com.example.Departmentemp.Dao.RegistrationDao;
import com.example.Departmentemp.Entity.Employee;
import com.example.Departmentemp.Entity.Registration;
import com.example.Departmentemp.Sevice.EmployeeService;



@Service
public class EmoloyeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAo employeeDAo;
	
	@Autowired
	private RegistrationDao registrationDao;

	@Override
	public void save(Employee emp) {

		Employee save = employeeDAo.save(emp);
		System.out.println(save.toString());

	}

	@Override
	public Optional<Employee> getId(String id) {

		return employeeDAo.findById(Long.parseLong(id));

	}

	@Override
	public void deleteEmployee(String id) {
		
		employeeDAo.deleteById(Long.parseLong(id));
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAo.findAll();
	}

	@Override
	public void saveRegistrationDetail(Registration registration) {
	
		registrationDao.save(registration);
		
	}


	@Override
	public String getemail(String email, String password) {
		String massage="";
		List<Registration> list=  registrationDao.findByEmail(email);
		for (Registration rs : list) {
			if(rs.getEmail().equals(email) && rs.getPassword().equals(password)) {
				massage= "Login Successfull";
			}else {
				massage= "Login UnSuccessfull";
			}
			 
		}
		
			
		return massage;
	}

}
