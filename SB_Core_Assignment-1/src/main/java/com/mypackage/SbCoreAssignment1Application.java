package com.mypackage;

import java.util.Optional;
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
		
		EmployeeRepository er = ac.getBean(EmployeeRepository.class);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Management.... \n  Choose from the following:   ");
		System.out.println("1. for Insert data.\n2. for Delete Data \n3. for Update data \n4. for Select data from id \n5. for Select all data");
		System.out.println("Option: ");
		int choise = sc.nextInt();
		
		switch (choise) {
		case 1: {
			//Insert.
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
			
			er.save(e);
		}
		break;
		
		case 2: {
			//Delete.
			System.out.print("Enter Rollno. to delete:");
			int eid = sc.nextInt();
			
			er.deleteById(eid);
		}
		break;
		
		case 3: {
			//Update.
			System.out.print("Enter Rollno. :");
			int epid = sc.nextInt();
			Optional<Employee> ey =er.findById(epid);
			Employee eyee = ey.get();
			System.out.println("1. Update Name \n2.Update Salary\nChoose for update:  ");
		
			int op = sc.nextInt();
			if(op==1) {
				System.out.print("Enter new Name");
				sc.nextLine();
				String ename = sc.nextLine();
				eyee.setEname(ename);
				er.save(eyee);
			}
			else if(op==2) {
				System.out.print("Enter new Salary.");
				int esal = sc.nextInt();
				eyee.setEsalary(esal);;
				er.save(eyee);
			}
			else {
				System.out.print("Enter Valid Number.");
			}
			
			
		}
		break;
		
		case 4: {
			//Select by id.
			System.out.print("Enter Rollno. :");
			int eplid = sc.nextInt();
			
			Employee ey = er.findById(eplid).get();
			System.out.println("Id: "+ey.getEid()+"\nName: "+ey.getEname()+"\nSalary: "+ey.getEsalary()+"\n------------------------------------------------------------------");
			
		}
		break;
		
		case 5: {
			//Select All.
			
			Iterable<Employee> itr = er.findAll();
			for(Employee emp : itr) {
				System.out.println("Id: "+emp.getEid()+"\nName: "+emp.getEname()+"\nSalary: "+emp.getEsalary()+"\n------------------------------------------------------------------");
			}
			
			
		}
		break;
		default:
			System.out.println("enter valid number.");
			}
	
		
//		EmployeeRepository er = ac.getBean(EmployeeRepository.class);
//		
//		Employee e = new Employee();
//		e.set
		
	}

}
