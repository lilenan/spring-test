package com.zj.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  //声明当前类是spring管理的一个Bean
public class UseFunctionService {
	@Autowired  //注入FunctionService的实体Bean
	FunctionService functionService;
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
