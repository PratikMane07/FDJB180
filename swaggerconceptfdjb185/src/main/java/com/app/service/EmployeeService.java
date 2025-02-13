package com.app.service;

import com.app.model.Employee;

public interface EmployeeService {
	
	
	public Employee addEmployee(Employee emp);

	public Employee logincheck(String username, String password);

}
