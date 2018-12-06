package com.yonyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.yonyou.mapper")
public class yonyouApplication {

	public static void main(String[] args) {
		SpringApplication.run(yonyouApplication.class, args);
	}
}
