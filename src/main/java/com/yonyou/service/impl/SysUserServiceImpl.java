package com.yonyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.yonyou.mapper.SysUserMapper;
import com.yonyou.pojo.SysUser;
import com.yonyou.service.SysUserService;

import tk.mybatis.mapper.entity.Example;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;

	/**
	 * 保存用户
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUser(SysUser user) throws Exception {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sysUserMapper.insert(user);
	}

	/**
	 * 分页查询所有用户
	 */
	@Override
	public List<SysUser> queryAllUserPaged(SysUser user, Integer page, Integer pageSize) {
		PageHelper.startPage(page,pageSize);
		
		Example example = new Example(SysUser.class);
		Example.Criteria criteria = example.createCriteria();
		
		/*if(!StringUtils.isEmptyOrWhitespace(user.getName())) {
			criteria.andLike("name", "%" + user.getName() +"%");
		}*/
		example.orderBy("createtime").desc();
		List<SysUser> userList = sysUserMapper.selectByExample(example);
		
		return userList;
	}
	
	/**
	 * 登录验证查询
	 */
	@Override
	public String loginYesOrNo(String username,String password) {
		int num = sysUserMapper.countLogin(username, password);
		if(num == 1) {
			return "yes";
		}else {
			return "no";
		}
	}
}
