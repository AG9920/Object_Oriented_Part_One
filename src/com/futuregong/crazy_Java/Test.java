package com.futuregong.crazy_Java;

/*
 * ����ִ��new Leaf()���룬��������Leaf���󣬵�һ�δ�����ʱ����Ϊϵͳ�л�������Leaf���������Ҫ�ȼ��ز���ʼ��Leaf�࣬
 * ��ʼ��Leaf�����ִ���䶥�㸸��ľ�̬��ʼ���飬��ִ����ֱ�Ӹ���ľ�̬��ʼ���飬����ִ��Leaf����ľ�̬��ʼ���顣
 * 
 * һ��Leaf���ʼ���ɹ���Leaf���ڸ�������ｫһֱ���ڣ���˵��ڶ��δ���Leafʵ��ʱ�������ٴζ�Leaf����г�ʼ��
 * 
 * ��ͨ��ʼ����͹�������ִ��˳����ǰ����ܵ�һ�£�ÿ�δ���һ��Leaf����ʱ������Ҫ��ִ����㸸��ĳ�ʼ���飬��������Ȼ����ִ���丸��ĳ�ʼ���飬������������
 * ����ִ��Leaf��ĳ�ʼ����͹�����
 * 
 * 
 * Javaϵͳ���ز���ʼ��ĳ����ʱ�����Ǳ�֤��������и��ࣨ����ֱ�Ӹ���ͼ�Ӹ��ࣩȫ�����ز���ʼ����
 */
public class Test {
	public static void main(String[] args) {
		new Leaf();
		new Leaf();
	}
}

class Root{
	// �Ƚ�һ�£���̬��ʼ���飬��ʼ���飬��������ִ��˳��
	static{
		System.out.println("Root�ľ�̬��ʼ����");
		
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root(){
		System.out.println("Root���޲����Ĺ�����");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid�ĳ�ʼ����");
	}
	public Mid(){
		System.out.println("Mid���޲����Ĺ�����");
	}
	public Mid(String msg){
		this();
		System.out.println("Mid�Ĵ������������������ֵ��"+msg);
	}
}

class Leaf extends Mid{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}
	public Leaf(){
		super("Structs2Ȩ��ָ��");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}
