package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login")
	// Controller에서 jsp로 전달할 때 model에 넣어서 전달
	public String goToLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("Request param is {}", name);
		return "login";
	}
}
