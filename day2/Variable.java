/*
	定义java中的变量
*/
public class Variable{
	public static void main(String[] args){
		//定义整数类型，字节类型byte类型 1字节
		byte b = 60;
		System.out.println(b);
		//定义整数类型，字节类型short类型 2字节
		short s = 200;
		System.out.println(s);
		//定义整数类型，字节类型int类型 4字节
		int i = 500006;
		System.out.println(i);

		float f = 1.2F;
		int f2 = (int)f;
		System.out.println(f);
		System.out.println(f2);

		char c = '我' ;
		System.out.println(c);
		// String 属于引用类型，定义方法和基本类型一样
		String s2 = "我爱Java";
		System.out.println(s2);

	}
}