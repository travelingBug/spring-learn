package com.wondersgroup.test;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.wondersgroup.bean.Car;
import com.wondersgroup.bean.Person;

/**
 * 
 * @author Administrator
 *
 */
public class IOCTest {
	 ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("ioc2.xml");
	 
	 @Test
	 public void test() {
		 Object bean = ioc.getBean("book01");
		 System.out.println(bean);
		 ioc.close();
	}
	 
	 
	 @Test
	 public void test02() {
		 Object bean = ioc.getBean("book02");
		 System.out.println(bean);
		 ioc.close();
	}
	 /**
	  * org.springframework.beans.factory.BeanDefinitionStoreException: 
	  * IOException parsing XML document from class path resource [ioc2.xml]; 
	  * nested exception is java.io.FileNotFoundException: 
	  * class path resource [ioc2.xml] cannot be opened because it does not exist
	 
	  */
	 /**
	  * org.springframework.beans.factory.BeanCreationException: 
	  * Error creating bean with name 'dataSource' defined in class path resource [ioc2.xml]: 
	  * Instantiation of bean failed; 
	  * nested exception is java.lang.NoClassDefFoundError: com/mchange/v2/ser/Indirector
	 
	  */
	 @Test
	 public void test03() {
		 DataSource bean = ioc.getBean("dataSource",DataSource.class);
		 System.out.println(bean);
		 ioc.close();
	}
	 
	 
 

}
