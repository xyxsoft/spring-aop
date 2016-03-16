package com.xyxsoft.spring.ioc;

/**
 * 注入bean映射类
 * @author xyxsoft@126.com
 *
 */
public class BeanReference {
	
	
	private String name;
	
	private Object bean;
	
	/**
	 * 构造函数
	 * @param name
	 */
	public BeanReference(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getBean() {
		return bean;
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}
	
	
	

}
