package com.xyxsoft.spring.aop;

/**
 * 被代理的对象
 * @author xyxsoft@126.com
 *
 */
public class TargetSource {
	
	
	private Class targetClass;
	
	private Object target;
	
	
	public TargetSource( Object target,Class<?> targetClass) {
		this.targetClass = targetClass;
		this.target = target;
	}

	public Class getTargetClass() {
		return targetClass;
	}

	public Object getTarget() {
		return target;
	}
	
	

}
