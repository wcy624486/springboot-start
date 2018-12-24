package com.yonyou.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.pojo.SysUser;
import com.yonyou.utils.MyMapper;

public interface SysUserMapper extends MyMapper<SysUser> {
	/**
	 * 登录时查询用户名、密码
	 * @param username
	 * @param password
	 * @return
	 */
	int countLogin(@Param("username") String username,
				   @Param("password") String password);
	
	/**
	 * 多条件select * 
	 * @param username
	 * @param password
	 * @return
	 */
	List<SysUser> queryUsers(@Param("username") String username,
							 @Param("password") String password);
	
}