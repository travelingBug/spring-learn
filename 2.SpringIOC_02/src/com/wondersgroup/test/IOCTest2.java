package com.wondersgroup.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Administrator
 *
 */
public class IOCTest2 {
	 ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("ioc3.xml");
	 
	 @Test
	 public void test() {
		 Object bean = ioc.getBean("person");
		 System.out.println(bean);
	 }
	 
	 
	 @Test
	 public void test3() {
		 Object bean = ioc.getBean("person04");
		 System.out.println(bean);
	 }

}
