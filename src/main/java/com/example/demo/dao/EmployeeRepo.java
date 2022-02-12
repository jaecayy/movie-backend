package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Employee;
import com.example.demo.Model.EmployeePKid;

public interface EmployeeRepo extends CrudRepository<Employee, EmployeePKid>{

}
