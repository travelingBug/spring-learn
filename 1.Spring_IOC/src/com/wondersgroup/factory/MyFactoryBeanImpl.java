package com.wondersgroup.factory;

import org.springframework.beans.factory.FactoryBean;

import com.wondersgroup.bean.Book;

/**
 * ʵ����FactoryBean������spring������ʶ���� 
 * Spring ���Զ����ø�ʵ���ഴ��bean
 * 
 * @author CD180
 *
 */

public class MyFactoryBeanImpl implements FactoryBean<Book> {

	/**
	 * getObject:�������� ���ش�������
	 */
	@Override
	public Book getObject() throws Exception {
		Book book = new Book();
		book.setAuthor("��ж�");
		book.setBookName("���μ�");
		return book;
	}

	@Override
	public Class<?> getObjectType() {
		return Book.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

}
