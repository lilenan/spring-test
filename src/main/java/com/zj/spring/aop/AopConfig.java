package com.zj.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zj.spring.aop")
@EnableAspectJAutoProxy  ///开启Spring对AspectJ代理的支持
public class AopConfig {

}
