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

class MybatisTest {
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
		
		String resource  = "mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
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

}
