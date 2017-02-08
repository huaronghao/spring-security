package com.runghall.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @company: qishon
 * @author huaronghao
 * @date: 2017年02月06日 上午9:26:40 
 * @Description:
 */
@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}
