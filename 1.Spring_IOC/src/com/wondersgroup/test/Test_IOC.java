package com.wondersgroup.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wondersgroup.bean.Person;
import com.wondersgroup.factory.MyFactoryBeanImpl;

public class Test_IOC {

//	private  ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");
	private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");

	@Test
	public void test01() {
//		Person bean = ioc.getBean("person02",Person.class);
//		System.out.println(bean);

//		Person bean = ioc.getBean("person03",Person.class);
//		System.out.println(bean);

		/**
		 * org.springframework.beans.factory.BeanIsAbstractException: Error creating
		 * bean with name 'person01': Bean definition is abstract
		 */
//		Person bean = ioc.getBean("person01",Person.class);
//		System.out.println(bean);

		/**
		 * 实验8： ioc容器默认按照注册bean的顺序创建bean 改变bean的创建顺序 只是改变了bean的创建顺序
		 * 
		 */

	}

	@Test
	public void test02() {
		/**
		 * 实验9： 测试bean的作用域，分别创建单实例和多实例的bean* prototype：多实例 singleton：单实例的，默认的；
		 * 
		 * request：web环境下，同一次请求创建一个Bean实例（没用） session：web环境下，同一次会话创建一个Bean实例（没用）
		 */

		/**
		 * 没有添加@Test 注解
		 * 
		 * java.lang.Exception: No tests found matching
		 * [{ExactMatcher:fDisplayName=test02],
		 * {ExactMatcher:fDisplayName=test02(com.wondersgroup.test.Test_IOC)],
		 * {LeadingIdentifierMatcher:fClassName=com.wondersgroup.test.Test_IOC,fLeadingIdentifier=test02]]
		 * from org.junit.internal.requests.ClassRequest@46fbb2c1
		 */
//		 Object bean = ioc.getBean("car");

	}

	@Test
	public void test03() {
		/**
		 * 静态工厂 org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean
		 * named 'airPlane' is defined
		 * 
		 * 
		 */

		Object bean = ioc.getBean("airPlane");
		System.out.println(bean);

		Object bean2 = ioc.getBean("airPlane");
		System.out.println(bean2);

		System.out.println(bean == bean2);
		/**
		 * 实例工厂
		 */
		/**
		 * org.springframework.beans.factory.NoSuchBeanDefinitionException:
		 *  No bean named 'airPlane02' is defined

		 */
//		Object bean = ioc.getBean("airPlane02");
//		System.out.println(bean);
//		
//		Object bean2 = ioc.getBean("airPlane02");
//		System.out.println(bean2);
//		
//		System.out.println(bean == bean2);
	}
	@Test
	public void test04() throws Exception {
		
		Object bean = ioc.getBean("myFactoryBeanImpl");
		System.out.println(bean);
		
		Object bean2 = ioc.getBean("myFactoryBeanImpl");
		
		System.out.println(bean == bean2);
		
		MyFactoryBeanImpl bean3  = ioc.getBean("&myFactoryBeanImpl",MyFactoryBeanImpl.class);
		System.out.println(bean3.getClass());
		System.out.println(bean3.getObject());
		

	}
}
