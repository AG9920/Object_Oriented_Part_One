package com.futuregong.crazy_Java;

/*
 * ��ʼ�����ʹ��
 * ��Java����һ������ʱ��ϵͳ��Ϊ�ö��������ʵ�����Է����ڴ棨ǰ���Ǹ����Ѿ������ڹ��ˣ������ų���ʼ����Щʵ������ִ�г�ʼ�������ʼ��˳���ǣ���ִ�г�ʼ����
 * ����������ʱָ���ĳ�ʼֵ����ִ�й���������ָ���ĳ�ʼֵ��
 */
public class Person {
	
	{
		int a =6;
		if(a>4)System.out.println("Person��ʼ���飺�ֲ�����a��ֵ����4");
		System.out.println("Person�ĳ�ʼ����");
	}
	{
		System.out.println("Person�ĵڶ�����ʼ����");
	}
	public Person(){
		System.out.println("Person����޲���������");
	}
	public static void main(String[] args) {
		new Person();
	}
	
	/*
	 * ����������Է��֣���ʼ�����ִ�����ڹ��������Ҵ��ϵ�������ִ��
	 */

}
