package com.mycompany.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	@RequestMapping("/two")
	@ResponseBody
	public String test() {
		return "Spring boot";
	}
}
