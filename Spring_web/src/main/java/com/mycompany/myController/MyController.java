package com.mycompany.myController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/one")
	@ResponseBody
	
	public String test() {
		
		return "hello";
	}

}
