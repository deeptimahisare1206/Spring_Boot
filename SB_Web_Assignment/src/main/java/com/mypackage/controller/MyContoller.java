package com.mypackage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mypackage.dao.EmployeeRepository;
import com.mypackage.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;


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
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model mo) {
		Optional<Employee> op= employeeRepository.findById(id);
		Employee ep = op.get();
		mo.addAttribute("upemp",ep);
		return "update";
	}
	
	@RequestMapping("/updated")
	public String updated(@ModelAttribute Employee employee) {
		Employee i = employeeRepository.save(employee);
		System.out.println(i);
		return "redirect:/view";
	}
	
	@RequestMapping("/search")
	public String search( @RequestParam(name="search", required = false) String search , Model mode) {
	List<Employee> employee = employeeRepository.findByEnameContainingIgnoreCase(search);
		mode.addAttribute("find",employee);
		return "userList";
	}

}
