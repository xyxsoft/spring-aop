package com.xyxsoft.spring.ioc.context;

import java.util.Map;

import com.xyxsoft.spring.ioc.beans.BeanDefinition;
import com.xyxsoft.spring.ioc.beans.factory.AbstractBeanFactory;
import com.xyxsoft.spring.ioc.beans.factory.AutowireCapableBeanFactory;
import com.xyxsoft.spring.ioc.beans.io.ResourceLoader;
import com.xyxsoft.spring.ioc.beans.xml.XmlBeanDefinitionReader;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext{
	
	private String configLocation;

	

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
		this(configLocation,new AutowireCapableBeanFactory());
	}

	public ClassPathXmlApplicationContext(String configLocation,AbstractBeanFactory beanFactory) throws Exception {
		super(beanFactory);
		this.configLocation = configLocation;
		refresh();
	}

	
	public void refresh() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
		xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
		for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
			beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
		}
	}
}
