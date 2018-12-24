package com.yonyou.service;

import java.util.List;

import com.yonyou.pojo.SysUser;

public interface SysUserService {
	
	
	public void saveUser(SysUser user) throws Exception;
	
	public List<SysUser> queryAllUserPaged(SysUser user, Integer page, Integer pageSize);
	
	public String loginYesOrNo(String username,String password);
	
}
