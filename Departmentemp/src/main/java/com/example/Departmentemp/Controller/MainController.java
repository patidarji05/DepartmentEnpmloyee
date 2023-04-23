package com.example.Departmentemp.Controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Departmentemp.Entity.Employee;
import com.example.Departmentemp.Entity.Login;
import com.example.Departmentemp.Entity.Registration;
import com.example.Departmentemp.Sevice.EmployeeService;



@RestController
public class MainController {
	
	private static Logger log= LoggerFactory.getLogger(MainController.class);

	@Autowired
	private EmployeeService employeeService;
	
	
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView loginHome() {
	log.info("inside main page method ");
		ModelAndView mv = new ModelAndView("Login");
		
		return mv;
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute Login login, Model model) {
		ModelAndView mv =new ModelAndView();
			  
		String massage=   employeeService.getemail(login.getEmail(),login.getPassword());
		  if("Login Successfull".equals(massage)) {
			  mv = new ModelAndView("redirect:/home");
		  }else {
			  mv.addObject("massage", massage);
			  mv= new ModelAndView("redirect:/");
		  }
		return mv;
	}
	
	
	@RequestMapping(value = "/registration")
	public ModelAndView registration() {
		ModelAndView mv = new ModelAndView("RegistrationPage");
				return mv;
	}
	
	@RequestMapping(value = "/saveregistration")
	public ModelAndView saveRegistration(@ModelAttribute Registration registration, Model model) {
		ModelAndView mv = new ModelAndView("Login");
		employeeService.saveRegistrationDetail(registration);
		return mv;
	}
	

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView mv = new ModelAndView("WelcomePage");
		List<Employee> employee=employeeService.getAllEmployee();
		mv.addObject("emp", employee);
		return mv;
	}

	@RequestMapping(value = "/addEmployee")
	public ModelAndView addEmployee() {
		ModelAndView mv = new ModelAndView("AddEmployee");
		return mv;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView addDetail(@ModelAttribute Employee emp, Model model) {
		ModelAndView mv= new ModelAndView("AddEmployee");
		
		employeeService.save(emp);
		return mv;
	}
	
	
	@RequestMapping(value = "/updateEmployee")
	public ModelAndView updatedata() {
		ModelAndView mv= new ModelAndView("UpdateEmployee");
		return mv;
	}
	
	@RequestMapping(value = "/GetEmployeeDetail", method = RequestMethod.GET)
	public ModelAndView getEmployeeDetail(HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("UpdateEmployee");
		String id = (request.getParameter("empId"));
		Optional<Employee> employee= employeeService.getId(id);
	     mv.addObject("emp", employee);
		return mv;
	}
	
	
	@RequestMapping(value = "/Update", method = RequestMethod.POST)
	public ModelAndView updateEmployee(HttpServletRequest request,@ModelAttribute Employee emp, Model model) {
		ModelAndView mv= new ModelAndView("UpdateEmployee");
		employeeService.save(emp);
		return mv;
	}
	
	@RequestMapping(value = "/deleteData")
	public ModelAndView deletedata() {
		ModelAndView mv= new ModelAndView("Delete");
		return mv;
	}
	
	@RequestMapping(value = "/GetEmployee", method = RequestMethod.GET)
	public ModelAndView getEmployee(HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("Delete");
		String id = (request.getParameter("empId"));
		Optional<Employee> employee= employeeService.getId(id);
	     mv.addObject("emp", employee);
		return mv;
	}
	
	@RequestMapping(value = "/deleteEmployee")
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		ModelAndView mv= new ModelAndView("Delete");
		String id = (request.getParameter("empId"));
		employeeService.deleteEmployee(id);
		return mv;
	}
}
