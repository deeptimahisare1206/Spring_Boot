package com.mypackage.dao;

import org.springframework.data.repository.CrudRepository;

import com.mypackage.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
