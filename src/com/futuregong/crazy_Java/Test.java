package com.futuregong.crazy_Java;

/*
 * 两次执行new Leaf()代码，创建两个Leaf对象，第一次创建的时候，因为系统中还不存在Leaf对象，因此需要先加载并初始化Leaf类，
 * 初始化Leaf类会先执行其顶层父类的静态初始化块，再执行其直接父类的静态初始化块，最后才执行Leaf本身的静态初始化块。
 * 
 * 一旦Leaf类初始化成功后，Leaf类在该虚拟机里将一直存在，因此当第二次创建Leaf实例时，无须再次对Leaf类进行初始化
 * 
 * 普通初始化块和构造器的执行顺序与前面介绍的一致，每次创建一个Leaf对象时，都需要先执行最顶层父类的初始化块，构造器。然后再执行其父类的初始化块，构造器……。
 * 最后才执行Leaf类的初始化块和构造器
 * 
 * 
 * Java系统加载并初始化某个类时，总是保证该类的所有父类（包括直接父类和间接父类）全部加载并初始化。
 */
public class Test {
	public static void main(String[] args) {
		new Leaf();
		new Leaf();
	}
}

class Root{
	// 比较一下：静态初始化块，初始化块，构造器的执行顺序
	static{
		System.out.println("Root的静态初始化块");
		
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root(){
		System.out.println("Root的无参数的构造器");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的初始化块");
	}
	public Mid(){
		System.out.println("Mid的无参数的构造器");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid的带参数构造器，其参数值："+msg);
	}
}

class Leaf extends Mid{
	static{
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Leaf的普通初始化块");
	}
	public Leaf(){
		super("Structs2权威指南");
		System.out.println("执行Leaf的构造器");
	}
}
