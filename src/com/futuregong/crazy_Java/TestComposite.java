package com.futuregong.crazy_Java;

/*
 * �������ʵ�ָ��ã����ü̳У�
 * ���һ�¡���ϡ��͡��̳С�������ǰ���ǡ�has a���������ǡ�is a��
 */
class Animall{
	private void beat(){
		System.out.println("������������");
	}
	public void breath(){
		beat();
		System.out.println("��һ��������һ�����������С���");
	}
}
class Bird{
	private Animall a;
	public Bird(Animall a){
		this.a = a;
	}
	//���¶���һ���Լ���breath����
	public void breath(){
		a.breath();
	}
	public void fly(){
		System.out.println("����������ɵķ��衭��");
	}
}
class Wolff{
	//��ԭ���ĸ���Ƕ��ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animall a;
	public Wolff(Animall a){
		this.a =a ;
	}
	//���¶���һ���Լ���breath����
	public void breath(){
		//ֱ�Ӹ���Animal�ṩ��breath������ʵ��Bird��breath����
		a.breath();
	}
	public void run(){
		System.out.println("����½���ϵĿ��ٱ���");
	}
}

public class TestComposite {
	public static void main(String[] args) {
		//��ʱ��Ҫ��ʽ������Ƕ��Ķ���
		Animall a1 = new Animall();
		Bird b = new Bird(a1);
		b.breath();
		b.fly();
		//��ʱ��Ҫ��ʽ������Ƕ��Ķ���
		Animall a2 = new Animall();
		Wolff w = new Wolff(a2);
		w.breath();
		w.run();
	}

}
