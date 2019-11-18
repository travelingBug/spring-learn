package com.wondersgroup.factory;

import org.springframework.beans.factory.FactoryBean;

import com.wondersgroup.bean.Book;

/**
 * 实现了FactoryBean的类是spring可以认识的类 
 * Spring 会自动调用该实现类创建bean
 * 
 * @author CD180
 *
 */

public class MyFactoryBeanImpl implements FactoryBean<Book> {

	/**
	 * getObject:工厂方法 返回创建对象
	 */
	@Override
	public Book getObject() throws Exception {
		Book book = new Book();
		book.setAuthor("吴承恩");
		book.setBookName("西游记");
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
