package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repo.EmployeeRepo;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo er;

	@Override
	public Employee addEmployee(Employee emp) {
		
		Employee employee = er.save(emp);
		
		return employee;
	}

	@Override
	public Employee logincheck(String username, String password) {
		
	Employee srt	 = er.findByUsernameAndPassword(username, password);
	
		
		return srt;
	}

}
