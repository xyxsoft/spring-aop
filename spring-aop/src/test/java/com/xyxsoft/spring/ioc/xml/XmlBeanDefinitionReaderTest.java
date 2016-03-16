package com.xyxsoft.spring.ioc.xml;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.xyxsoft.spring.ioc.beans.BeanDefinition;
import com.xyxsoft.spring.ioc.beans.io.ResourceLoader;
import com.xyxsoft.spring.ioc.beans.xml.XmlBeanDefinitionReader;

public class XmlBeanDefinitionReaderTest {
	
	@Test
	public void test() throws Exception {
		XmlBeanDefinitionReader xmlBeanDefinitionReader=new XmlBeanDefinitionReader(new ResourceLoader()); 
		xmlBeanDefinitionReader.loadBeanDefinitions("springioc.xml");
		Map<String, BeanDefinition> registry=xmlBeanDefinitionReader.getRegistry();
		Assert.assertTrue(registry.size() > 0);
	}

}
