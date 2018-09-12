package com.zj.spring.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //声明当前类是一个配置类
@ComponentScan("com.zj.spring.di")  //自动扫面包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean
public class DiConfig {

}
