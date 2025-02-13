package com.app.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp)
	{
		
		Employee employee = es.addEmployee(emp);
		
		return new ResponseEntity<Employee>(employee , HttpStatus.CREATED);
		
	}
	
	@GetMapping("/login/{username}/{password}")
     public ResponseEntity<Employee> login(@PathVariable("username") String username, @PathVariable("password") String password)
     {
		Employee str = es.logincheck(username, password);
		
		
		return new ResponseEntity<Employee>(str, HttpStatus.ACCEPTED);
    	 
     }
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		
	}


}
