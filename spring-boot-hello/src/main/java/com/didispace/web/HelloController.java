package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index() {
		return "Hello Mia";
	}

	@RequestMapping("/getUser")
	public User getUser() {
		User user=new User();
		user.setUserName("小明");
		user.setPassWord("xxxx");
		return user;
	}

}