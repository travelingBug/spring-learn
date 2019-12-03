package com.wonders.mybatis.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.wonders.mybatis.bean.Employee;
import com.wonders.mybatis.dao.EmployeeMapper;
/**
 * 1、接口编程
 * 原生： 			Dao===> DaoImpl
 * mybatis 		Mapper ===> xxMapper.xml
 * 
 * 2、SqlSession代表和数据库的一次会话
 * 3、SqlSession和connection一样它都是非线程安全的。每次使用都应该获取新的对象。
 * 4、mapper接口没有实现类，但是mybatis会为这个接口生成一个代理对象（需要将接口和xxMapper.xml文件绑定）
 * 
 * 
 * @author Administrator
 *
 */
class MybatisTest {
	private  static SqlSessionFactory sessionFactory ;
	static {
		String resource  = "mybatis-conf.xml";
		InputStream inputStream= null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	/**
	 * 1、根据xml配置文件（全局配置文件） 创建一个SqlSessionFactory对象
	 * 2、sql映射文件：配置了每一个sql，已经sql的封装规则
	 * 3、将sql映射文件注册到全局配置文件中
	 * 4、写代码：
	 * 		1）根据全局配置文件得到SqlSessionfactory
	 * 		2）使用SqlSessionfactory工厂获取到SqlSession实例，使用它来进行数据库操作
	 * 			一个SqlSession代表一个和数据的会话，用完关闭
	 * 		3）使用sql 的唯一标识来告诉mybatis执行哪个sql。sql都是保存在sql映射文件中的。
	 * @throws IOException
	 */
	@Test
	void test() throws IOException {
		
		//2/ 获取SqlSesson实例 ，能够直接执行已经映射的sql语句
		
		/**
		 * org.apache.ibatis.exceptions.PersistenceException: 
			### Error building SqlSession.
			### The error may exist in SQL Mapper Configuration
			### Cause: org.apache.ibatis.builder.BuilderException: 
			Error parsing SQL Mapper Configuration. 
			Cause: java.lang.ClassNotFoundException: Cannot find class: com.wj.mybatis.dao.MapperEmployeeAnnotation
		 */
		/**
		 * org.apache.ibatis.exceptions.PersistenceException: 
			### Error querying database.  Cause: java.lang.IllegalArgumentException: 
			Mapped Statements collection does not contain value for com.wonders.mybatis.bean.Employee.selectEmp
			### Cause: java.lang.IllegalArgumentException:
			 Mapped Statements collection does not contain value for com.wonders.mybatis.bean.Employee.selectEmp
		 */
		SqlSession  openSession = sessionFactory.openSession();
		try {
			Employee employee= openSession.selectOne("com.wonders.mybatis.bean.Employee.selectEmp",1);
			System.out.println(employee);
		} finally {
			openSession.close();
		}
		
	}
	@Test
	public void test2() {
		SqlSession openSession = null;
		try {
			 openSession = sessionFactory.openSession();
			 /**
			  * 获取接口的实现类对象
			  * 会接口自动创建一个代理对象，由代理对象执行增删改查方法
			  */
			 EmployeeMapper emMapper = openSession.getMapper(EmployeeMapper.class);//mybatis生成一个代理对象
			 System.out.println(emMapper);
			 Employee e = emMapper.getEmpById(1);
			 System.out.println(e);
		} finally {
			openSession.close();
		}
	}

}
