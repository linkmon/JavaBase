package com.cxl.javaone.one;

public class Person {
	// 成员变量
	private String name = "Jack";
	private int age = 35;
	private boolean married = true;
	// 构造函数
	public Person() {
		// 这是一个无参的构造函数，系统默认就有
	}
	// 有参数的构造函数
	public Person(String name, int age, boolean married) {
		this.name = name;
		this.age = age;
		this.married = married;
	}
	// 定义一个displayer方法,打印出这个对象的自身信息
	public void displayer() {
		System.out.println("姓名是：" + this.name + " 年龄是:" + this.age + " 婚姻状况:" + this.married);
	}
	public static void main(String[] args) {
		//使用默认无参的构造函数
		Person p = new Person();
		p.displayer();
		//使用有参数的构造函数
		Person p2 = new Person("luna",23,false);
		p2.displayer();
	}

}
