package com.xyxsoft.spring.ioc.context;

import org.junit.Test;

import com.xyxsoft.spring.ioc.HelloWorldService;

public class ApplicationContextTest {
	@Test
	public void test() throws Exception {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springioc.xml");
		HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();
		
	}

}
