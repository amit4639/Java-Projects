package com.hcl.java8streams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.java8streams.dao.EmployeeDao;
import com.hcl.java8streams.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDAO;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployee();
	}

	

	

}
