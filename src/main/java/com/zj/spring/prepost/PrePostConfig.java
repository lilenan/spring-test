package com.zj.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zj.spring.prepost")
public class PrePostConfig {
	//指定BeanWayService类的init和destroy方法在构造之后、Bean销毁之前执行
	@Bean(initMethod="init",destroyMethod="destroy")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}
