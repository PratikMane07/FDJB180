package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	public Employee findByUsernameAndPassword(String un, String ps);
	
}
