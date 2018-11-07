package com.yonyou.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonyou.pojo.User;

@Controller
@RequestMapping("th")
public class ThymeleafController {
	
	@RequestMapping("/index")
	public String index(ModelMap map){
		map.addAttribute("name","yonyou30周年");
		return "thymeleaf/index";
	}
	
	@RequestMapping("center")
	public String center(){
		return "thymeleaf/center/center";
	}
	
	@RequestMapping("test")
	public String test(ModelMap map){
		User u = new User();
		u.setName("qaz");
		u.setAge(18);
		u.setBirthday(new Date());
		
		map.addAttribute("user", u);
		return "thymeleaf/test";
	}

}
