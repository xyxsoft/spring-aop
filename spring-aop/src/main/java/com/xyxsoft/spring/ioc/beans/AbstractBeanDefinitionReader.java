package com.xyxsoft.spring.ioc.beans;

import java.util.HashMap;
import java.util.Map;

import com.xyxsoft.spring.ioc.beans.io.ResourceLoader;

/**
 * 从配置文件中读取信息
 * @author xyxsoft@126.com
 *
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{
	
	
	private Map<String, BeanDefinition> registry;
	
	private ResourceLoader resourceLoader;
	
	protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
		this.registry = new HashMap<String, BeanDefinition>();
		this.resourceLoader = resourceLoader;
	}

	public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
	
	
	

}
