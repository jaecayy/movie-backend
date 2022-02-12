package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.dao.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping
	public String addEmployee(@RequestBody Employee employee) {
		repo.save(employee);
		return "Success";
	}
	
	@GetMapping
	public List<Employee> getAllEmployee(){
		List<Employee> allemployee = (List<Employee>) repo.findAll();
		return allemployee;
	}
	
	
}
