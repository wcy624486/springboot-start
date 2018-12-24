package com.yonyou.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.mapper.SysUserMapper;
import com.yonyou.pojo.SysUser;
import com.yonyou.pojo.YonyouJSONResult;
import com.yonyou.service.SysUserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("sysuser")
public class SysUserController {
	
	@Autowired
	private SysUserService sysUserService;
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private Sid sid;
	
	/**
	 * 保存用户
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveUser")
	public	YonyouJSONResult saveUser() throws Exception{
		
		String userId = sid.nextShort();
		
		SysUser user = new SysUser();
		user.setUserid(userId);
		user.setCreatetime(new Date());
		user.setName("创建测试a");
		user.setUsername("用户" + new Date().getTime());
		user.setPassword("p" + new Date().getTime() + "q");
		
		sysUserService.saveUser(user);
		
		return YonyouJSONResult.ok("保存成功！");
	}
	
	@RequestMapping("/queryAllUserPaged")
	public YonyouJSONResult queryUserAllPaged(Integer page) {
		
		if(page == null) {
			page = 1;
		}
		
		int pageSize = 10;
		
		SysUser user = new SysUser();
		
		List<SysUser> userList = sysUserService.queryAllUserPaged(user, page, pageSize);
		
		return YonyouJSONResult.ok(userList);
		
	}
	
	@RequestMapping("/queryUserForLogin")
	//@PostMapping(value = "/queryUserForLogin",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	//post格式的请求可以限制传入参数的格式
	
	public YonyouJSONResult queryUserForLogin(HttpServletRequest request) throws IOException {
		
		/*BufferedReader reader = request.getReader();
        String json = reader.readLine();
        System.out.println(json);*/
        
        String json = "{\"account\":\"用户1545640482294\",\"password\":\"p1545640482294q\"}";//yes
        //String json = "{\"account\":\"用户1545640482294\",\"password\":\"p1545640482294\"}";//no
        JSONObject userJson = JSONObject.fromObject(json);
		
        String username = userJson.getString("account");
        String password = userJson.getString("password");
        
        String loginState = sysUserService.loginYesOrNo(username, password); 
		
        System.out.println(loginState);
        
		return YonyouJSONResult.ok(loginState);
	}
}
