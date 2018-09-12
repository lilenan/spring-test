package com.zj.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
//实现BeanNameAware, ResourceLoaderAware接口，获得Bean名称和资源加载的服务
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;

	//实现ResourceLoaderAware需重写setResourceLoader
	public void setResourceLoader(ResourceLoader arg0) {
		this.loader = arg0;
	}

	//实现BeanNameAware需重写setBeanName
	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}

	public void outputResult() {
		System.out.println("Bean的名称为：" + beanName);
		Resource resource = loader.getResource("classpath:com/zj/spring/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
