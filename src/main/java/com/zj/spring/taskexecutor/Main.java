package com.zj.spring.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
		
		for(int i=0;i<10;i++){
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.exectueAsyncTaskPlus(i);
		}
		context.close();
	}

}
