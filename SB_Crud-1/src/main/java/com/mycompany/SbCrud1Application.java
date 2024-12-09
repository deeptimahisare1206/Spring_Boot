package com.mycompany;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbCrud1Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SbCrud1Application.class, args);
		EmployeeRepository epr= ac.getBean(EmployeeRepository.class);
//		Employee e= new Employee();
//		e.setEid(2);
//		e.setEname("Bhoot");
//		e.setSalary(30000);
//		
//		epr.save(e);
//		System.out.println("Inserted!");
		
//		Iterable<Employee> l = epr.findAll();
//		for (Employee ep : l) {
//			System.out.println(ep.getEid()+" : "+ ep.getEname()+" : "+ep.getSalary());
//			
//		}
		
//		epr.delete(e);
		
	Employee emp = epr.findById(2).get();
		
	System.out.println(emp.getEid()+" : "+emp.getEname()+" : "+emp.getSalary());
	
	Employee e= new Employee();

	
	emp.setEname(e.setEname("Tenali"));
	
	}


}
