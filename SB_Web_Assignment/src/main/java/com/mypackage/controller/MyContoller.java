package com.mypackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mypackage.dao.EmployeeRepository;
import com.mypackage.entity.Employee;


@Controller
public class MyContoller {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	

	@RequestMapping("/insert")
	public String insert(@ModelAttribute Employee employee) {
		Employee i = employeeRepository.save(employee);
		System.out.println(i);
		return "redirect:/view";
	}
	
	@RequestMapping("/view")
	public String view(Model mod) {
		Iterable<Employee> itr =employeeRepository.findAll();
		mod.addAttribute("list", itr);
		return "display";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id) {
		employeeRepository.deleteById(id);
		return "redirect:/view";
	}
//	@RequestMapping("/update")
//	public String update(@RequestParam Integer id) {
//		employeeRepository.deleteById(id);
//		return "redirect:/view";
//	}
	

}
