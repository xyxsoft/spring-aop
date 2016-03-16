package com.xyxsoft.spring.ioc.beans;

/**
 * bean的内容及元数据，保存在BeanFactory中，包装bean的实体
 * 
 * @author xyxsoft@126.com
 */
public class BeanDefinition {

	private Object bean;

	private Class beanClass;

	private String beanClassName;

	private PropertyValues propertyValues = new PropertyValues();

	public BeanDefinition() {
	}

	public void setBean(Object bean) {
		this.bean = bean;
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public String getBeanClassName() {
		return beanClassName;
	}
	
	/**
	 * 其内部是通过反射的机制来setBean
	 * @param beanClassName
	 */
	public void setBeanClassName(String beanClassName) {
		this.beanClassName = beanClassName;
		try {
			this.beanClass = Class.forName(beanClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Object getBean() {
		return bean;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}
}
