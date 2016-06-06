package com.futuregong.crazy_Java;

/*
 * 初始化块的使用
 * 当Java创建一个对象时，系统先为该对象的所有实例属性分配内存（前提是该类已经被加在过了），接着程序开始对这些实例属性执行初始化，其初始化顺序是：先执行初始化块
 * 或声明属性时指定的初始值，再执行构造器里面指定的初始值。
 */
public class Person {
	
	{
		int a =6;
		if(a>4)System.out.println("Person初始化块：局部变量a的值大于4");
		System.out.println("Person的初始化块");
	}
	{
		System.out.println("Person的第二个初始化块");
	}
	public Person(){
		System.out.println("Person类的无参数构造器");
	}
	public static void main(String[] args) {
		new Person();
	}
	
	/*
	 * 看结果，可以发现：初始化块的执行早于构造器，且从上到下依次执行
	 */

}
