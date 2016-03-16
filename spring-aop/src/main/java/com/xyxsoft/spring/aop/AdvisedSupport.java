package com.xyxsoft.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
/**
 * 被代理的相关元数据
 * @author xyxsoft@126.com
 *
 */
public class AdvisedSupport {
	
	
	private TargetSource targetSource;
	
	private MethodInterceptor methodInterceptor;

	public TargetSource getTargetSource() {
		return targetSource;
	}

	public void setTargetSource(TargetSource targetSource) {
		this.targetSource = targetSource;
	}

	public MethodInterceptor getMethodInterceptor() {
		return methodInterceptor;
	}

	public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
		this.methodInterceptor = methodInterceptor;
	}
	
	
	

}
