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
		 * ʵ��8�� ioc����Ĭ�ϰ���ע��bean��˳�򴴽�bean �ı�bean�Ĵ���˳�� ֻ�Ǹı���bean�Ĵ���˳��
		 * 
		 */

	}

	@Test
	public void test02() {
		/**
		 * ʵ��9�� ����bean�������򣬷ֱ𴴽���ʵ���Ͷ�ʵ����bean* prototype����ʵ�� singleton����ʵ���ģ�Ĭ�ϵģ�
		 * 
		 * request��web�����£�ͬһ�����󴴽�һ��Beanʵ����û�ã� session��web�����£�ͬһ�λỰ����һ��Beanʵ����û�ã�
		 */

		/**
		 * û�����@Test ע��
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
		 * ��̬���� org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean
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
		 * ʵ������
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
