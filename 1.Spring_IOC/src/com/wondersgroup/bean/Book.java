package com.wondersgroup.bean;

public class Book {
	private String bookName;
	private String author;
	public Book() {
		super();
		System.out.println("book�������ˡ���");
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
