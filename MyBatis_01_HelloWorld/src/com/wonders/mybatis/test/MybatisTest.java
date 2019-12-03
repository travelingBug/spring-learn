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
 * 1���ӿڱ��
 * ԭ���� 			Dao===> DaoImpl
 * mybatis 		Mapper ===> xxMapper.xml
 * 
 * 2��SqlSession��������ݿ��һ�λỰ
 * 3��SqlSession��connectionһ�������Ƿ��̰߳�ȫ�ġ�ÿ��ʹ�ö�Ӧ�û�ȡ�µĶ���
 * 4��mapper�ӿ�û��ʵ���࣬����mybatis��Ϊ����ӿ�����һ�����������Ҫ���ӿں�xxMapper.xml�ļ��󶨣�
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
	 * 1������xml�����ļ���ȫ�������ļ��� ����һ��SqlSessionFactory����
	 * 2��sqlӳ���ļ���������ÿһ��sql���Ѿ�sql�ķ�װ����
	 * 3����sqlӳ���ļ�ע�ᵽȫ�������ļ���
	 * 4��д���룺
	 * 		1������ȫ�������ļ��õ�SqlSessionfactory
	 * 		2��ʹ��SqlSessionfactory������ȡ��SqlSessionʵ����ʹ�������������ݿ����
	 * 			һ��SqlSession����һ�������ݵĻỰ������ر�
	 * 		3��ʹ��sql ��Ψһ��ʶ������mybatisִ���ĸ�sql��sql���Ǳ�����sqlӳ���ļ��еġ�
	 * @throws IOException
	 */
	@Test
	void test() throws IOException {
		
		//2/ ��ȡSqlSessonʵ�� ���ܹ�ֱ��ִ���Ѿ�ӳ���sql���
		
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
			  * ��ȡ�ӿڵ�ʵ�������
			  * ��ӿ��Զ�����һ����������ɴ������ִ����ɾ�Ĳ鷽��
			  */
			 EmployeeMapper emMapper = openSession.getMapper(EmployeeMapper.class);//mybatis����һ���������
			 System.out.println(emMapper);
			 Employee e = emMapper.getEmpById(1);
			 System.out.println(e);
		} finally {
			openSession.close();
		}
	}

}
