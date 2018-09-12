package com.zj.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //
public class JavaConfig {
	@Bean  //
	public FunctionService functionService(){
		return new FunctionService();
	}
}
