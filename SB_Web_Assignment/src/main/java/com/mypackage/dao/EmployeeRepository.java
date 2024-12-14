package com.mypackage.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mypackage.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	public List<Employee> findByEnameContainingIgnoreCase(String ename);
}
