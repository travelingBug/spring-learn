package com.wondersgroup.bean;

public class Book {
	private String bookName;
	private String author;
	
	

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("bookʵ���ĳ�ʼ�����������á���");
	}
	
	public void destroy() {
		System.out.println("bookʵ�������ٷ��������á���");
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + "]";
	}

	
}
