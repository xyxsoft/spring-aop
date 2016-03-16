package com.xyxsoft.spring.ioc.beans;

import java.io.IOException;

/**
 * 从配置文件中读取信息
 * @author xyxsoft@126.com
 *
 */
public interface BeanDefinitionReader {
	
	void loadBeanDefinitions(String location) throws  Exception;

}
