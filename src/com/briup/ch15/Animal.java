package com.briup.ch15;

public class Animal {
	private String name;
	private int age;
	public Animal() {
		System.out.println("animal 的构造函数");
	}
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
		System.out.println("animal 的构造函数");
	}
	
	public void move(){
		System.out.println(this.name+"正在移动。。。");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
}
