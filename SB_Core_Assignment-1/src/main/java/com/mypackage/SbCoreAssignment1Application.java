package com.mypackage;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mypackage.dao.EmployeeRepository;
import com.mypackage.entity.Employee;

@SpringBootApplication
public class SbCoreAssignment1Application {

	public static void main(String[] args) {
		ApplicationContext ac =  SpringApplication.run(SbCoreAssignment1Application.class, args);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Management.... \n  Choose from the following:   ");
		System.out.println("1. for Insert data.\n2. for Delete Data \n3. for Update data \n4. for Select data from id \n5. for Select all data");
		System.out.println("Option: ");
		int choise = sc.nextInt();
		
		switch (choise) {
		case 1: {
			System.out.print("Enter Rollno. :");
			int id = sc.nextInt();
			System.out.print("Enter Name. :");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Enter Salary. :");
			int salary = sc.nextInt();
			
			
			Employee e = new Employee();
			e.setEid(id);
			e.setEname(name);
			e.setEsalary(salary);
			
		}
		default:
			System.out.println("enter valid number.");
			}
	
		
//		EmployeeRepository er = ac.getBean(EmployeeRepository.class);
//		
//		Employee e = new Employee();
//		e.set
		
	}

}
