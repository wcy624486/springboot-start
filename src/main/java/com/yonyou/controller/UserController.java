package com.yonyou.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.pojo.User;
import com.yonyou.pojo.YonyouJSONResult;

//@Controller
@RestController			//@RestController  =  @Controller  +   @ResponseBody
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/getUser")
	//@ResponseBody
	public User getUser(){
		User u = new User();
		u.setName("messi2");
		u.setAge(18);
		u.setPassword("1231");
		u.setBirthday(new Date());
		return u;
	}
	
	@RequestMapping("/getUserJSON")
	//@ResponseBody
	public YonyouJSONResult getUserJSON(){
		User u = new User();
		u.setName("messi");
		u.setAge(18);
		u.setPassword("123");
		u.setBirthday(new Date());
		u.setDesc(null);
		return YonyouJSONResult.ok(u);
	}

}
