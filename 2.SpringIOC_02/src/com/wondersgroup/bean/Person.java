package com.wondersgroup.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private String lastName = "";
	private Integer age;
	private String gender;
	private String email;
	
	private Double salary;

	private Car car;

	private List<Book> books;
	
	private Map<String,Object> maps;
	

	private Properties properties;
	

	public Person(List<Book> books) {
		super();
		this.books = books;
	}

	public Person(Car car, List<Book> books) {
		super();
		this.car = car;
		this.books = books;
	}

	public Person(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Map<String, Object> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}

	public Integer getAge() {
		return age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String lastName, Integer age, String gender, String email) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}

	public Person(String lastName, Integer age, String gender) {
		super();
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}

	public Person(String lastName, String gender, String email) {
		super();
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", email=" + email + ", salary="
				+ salary + ", car=" + car + ", books=" + books + "]";
	}

	 

	 

}
