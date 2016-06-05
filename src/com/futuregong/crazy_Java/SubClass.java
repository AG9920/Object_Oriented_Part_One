package com.futuregong.crazy_Java;


/*
 * Now let's see a small example of Polymorphism
 */

/*
 * Java ����һ���������ֱ�Ӹ���һ���������ñ����������κ�����ת�������߱���Ϊ����ת�ͣ�upcasting)������ת����ϵͳ�Զ����
 */
public class SubClass extends BaseClass{
	
	public String book = "������J2EE��ҵӦ��ʵս";
	public void test(){
		System.out.println("����ĸ��Ǹ���ķ���");
	}
	public void sub(){
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		//Here comes the important part!!!!!! Look carefully !!!!
		BaseClass ploymophicBc = new SubClass();
		System.out.println(ploymophicBc.book);
		ploymophicBc.base();
		//The next line is quite important for it reflects the attribute of Polymorphism
		ploymophicBc.test();
		/*
		 * ����һ���������ֱ�Ӹ����������ñ��������ploymophicBc���ñ����ı���ʱ������BaseClass��������ʱ������SubClass��������ʱ���ø����ñ����ķ���ʱ��
		 * �䷽����Ϊ���������෽������Ϊ�����������෽����Ϊ���⽫������ͬ���ͱ�����ִ��ͬһ������ʱ���ֳ���ͬ����Ϊ����������Ƕ�̬��
		 * �뷽����ͬ���ǣ�����������򲻾߱���̬�ԣ������������book��Ȼ��6
		 */
	}

}

class BaseClass{
	public int book = 6;
	public void base(){
		System.out.println("�������ͨ����");
	}
	public void test(){
		System.out.println("����ı����ǵķ���");
	}
}