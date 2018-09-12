package com.zj.spring.javaconfig;

import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	
	FunctionService functionService;
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
