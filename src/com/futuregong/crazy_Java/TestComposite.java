package com.futuregong.crazy_Java;

/*
 * 利用组合实现复用（不用继承）
 * 体会一下“组合”和“继承”的区别，前者是“has a”，后者是“is a”
 */
class Animall{
	private void beat(){
		System.out.println("心脏跳动——");
	}
	public void breath(){
		beat();
		System.out.println("吸一口气，吐一口气，呼吸中——");
	}
}
class Bird{
	private Animall a;
	public Bird(Animall a){
		this.a = a;
	}
	//重新定义一个自己的breath方法
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("我在填空自由的飞翔……");
	}
}
class Wolff{
	//将原来的父类嵌入原来的子类，作为子类的一个组合成分
	private Animall a;
	public Wolff(Animall a){
		this.a =a ;
	}
	//重新定义一个自己的breath方法
	public void breath(){
		//直接复用Animal提供的breath方法来实现Bird的breath方法
		a.breath();
	}
	public void run(){
		System.out.println("我在陆地上的快速奔跑");
	}
}

public class TestComposite {
	public static void main(String[] args) {
		//此时需要显式创建被嵌入的对象
		Animall a1 = new Animall();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		//此时需要显式创建被嵌入的对象
		Animall a2 = new Animall();
		Wolff w = new Wolff(a2);
		w.breath();
		w.run();
	}

}
