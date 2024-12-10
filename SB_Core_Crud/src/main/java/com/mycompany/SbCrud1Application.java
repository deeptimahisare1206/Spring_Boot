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
		
//		==================================================================
		
//		Iterable<Employee> l = epr.findAll();
//		for (Employee ep : l) {
//			System.out.println(ep.getEid()+" : "+ ep.getEname()+" : "+ep.getSalary());
//			
//		}
//		==================================================================
			
//		epr.delete(e);
//		==================================================================
		
		//method 1 for update
	Employee emp = epr.findById(2).get();
	emp.setEname("pushpa");
	epr.save(emp);
//		
//	System.out.println(emp.getEid()+" : "+emp.getEname()+" : "+emp.getSalary());
//	
//	==================================================================
	
		//method 2 for update
//		Optional<Employee> o = epr.findById(2);
//		Employee ep = o.get();
//		ep.setEname("IIIII");
//		epr.save(ep);
		System.out.println("Update done");

//		==================================================================
		
	

	
	}


}
