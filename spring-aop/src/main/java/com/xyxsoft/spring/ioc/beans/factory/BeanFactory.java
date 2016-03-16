package com.xyxsoft.spring.ioc.beans.factory;

/**
 * bean工厂
 * @author xyxsoft@126.com
 *
 */
public interface BeanFactory {
	
	Object getBean(String name) throws Exception;

}
