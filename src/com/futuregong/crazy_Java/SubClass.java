package com.futuregong.crazy_Java;


/*
 * Now let's see a small example of Polymorphism
 */

/*
 * Java 允许一个子类对象直接赋给一个父类引用变量，无须任何类型转换，或者被称为向上转型（upcasting)，向上转型由系统自动完成
 */
public class SubClass extends BaseClass{
	
	public String book = "轻量级J2EE企业应用实战";
	public void test(){
		System.out.println("子类的覆盖父类的方法");
	}
	public void sub(){
		System.out.println("子类的普通方法");
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
		 * 当把一个子类对象直接赋给父类引用变量，这个ploymophicBc引用变量的编译时类型是BaseClass，而运行时类型是SubClass，当运行时调用该引用变量的方法时，
		 * 其方法行为总是像子类方法的行为，而不是像父类方法行为，这将出现相同类型变量，执行同一个方法时呈现出不同的行为特征，这就是多态。
		 * 与方法不同的是，对象的属性则不具备多态性，例如这里输出book依然是6
		 */
	}

}

class BaseClass{
	public int book = 6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类的被覆盖的方法");
	}
}