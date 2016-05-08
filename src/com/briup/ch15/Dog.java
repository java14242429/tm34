package com.briup.ch15;

public class Dog extends Animal {
	private String color;
	public Dog() {
		//super("无名狗",1);
		System.out.println("Dog的构造函数");
	}
	public void seeDoor(){
		System.out.println(this.getName()+"正在看门");
	}
	
	
	@Override
	public void move() {
		System.out.println(super.getName()+"正在奔跑");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [color=" + color +"name="+this.getName()+",age="+super.getAge()+ "]";
	}
}
