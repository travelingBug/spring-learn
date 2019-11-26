package com.wondersgroup.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	/**
	 * ��ʼ��֮ǰ����
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("��"+beanName+"����Ҫ���ó�ʼ�������ˣ�" + bean);
		return bean;
	}

	/**
	 * 
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("��"+beanName+"����ʼ������������ɣ�" + bean);
		return bean;
	}
 

}
