package com.hcl.java8streams.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.java8streams.model.Employee;
import com.hcl.java8streams.service.EmployeeService;



@Controller
public class EmployeeController {
	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);
	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {

		List<Employee> listEmployee =employeeService.getAllEmployee();
		model.addObject("searchEmployee",new Employee());
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value ="/search",method=RequestMethod.POST)
	public ModelAndView searchEmployee(@ModelAttribute Employee searchEmployee, ModelAndView model) throws IOException {

		List<Employee> listEmployee =employeeService.getAllEmployee();
		logger.debug("==============================");
		logger.debug("Employee fetched:" +listEmployee.size());
		
		if(searchEmployee.getEmp_tblband()==0 || searchEmployee.getEmp_tblband()=='0')
		{
		listEmployee=listEmployee.stream().filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName()) || var.getEmp_tblband()=='E'
		|| var.getEmp_tblband()=='C'|| var.getEmp_tblband()=='M'
		&& var.getSalary()>searchEmployee.getSalary()).collect(Collectors.toList());
		}
		else
		{
			System.out.println("Not Found");
		}
		model.addObject("searchEmployee",searchEmployee);
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		logger.debug("redirecting to home.jsp");
		return model;
		
	}


}






