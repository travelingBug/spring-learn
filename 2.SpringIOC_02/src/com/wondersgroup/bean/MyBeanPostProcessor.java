package com.wondersgroup.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	/**
	 * 初始化之前调用
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【"+beanName+"】将要调用初始化方法了：" + bean);
		return bean;
	}

	/**
	 * 
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【"+beanName+"】初始化方法调用完成：" + bean);
		return bean;
	}
 

}
