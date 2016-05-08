package com.briup.ch15;

public class Test {
	public static void main(String[] args) {
		new Test().test2();
	}
	//测试多态
	public void test2(){
		Animal a = new Dog();
		a.setName("一休");
		a.setAge(2);
		a.move();
	}
	//测试继承
	public void test1(){
		Dog dog = new Dog();
		dog.setName("一休");
		dog.setAge(2);
		dog.setColor("金黄色");
		
		dog.move();
		System.out.println(dog.toString());
		System.out.println(dog);
	}
}
