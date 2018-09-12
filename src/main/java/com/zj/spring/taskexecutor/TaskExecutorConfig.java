package com.zj.spring.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.zj.spring.taskexecutor")
@EnableAsync   //开启异步任务支持
//实现AsyncConfigurer接口并重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor,这样就获得了一个基于线程池TaskExecutor
public class TaskExecutorConfig implements AsyncConfigurer {

	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);//设置线程池的基本大小，线程池维护线程的最少数量
		taskExecutor.setMaxPoolSize(10);//设置线程池中允许的最大线程数，线程池维护线程的最大数量
		taskExecutor.setQueueCapacity(25);//线程池所使用的缓冲队列
		taskExecutor.initialize();//初始化线程池
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

}
