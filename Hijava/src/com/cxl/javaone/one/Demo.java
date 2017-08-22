package com.cxl.javaone.one;

public class Demo {

	public static void main(String[] args) {
       //算术运算
		int a = 32;
		int b = 5;
		System.out.println("a + b =" + (a + b));
		// 通过使用（）来改变运算顺序
		//syso + Alt + /可快速打出System.out.println
		System.out.println("a + b =" + (a - b));
		System.out.println("a + b =" + (a * b));
		System.out.println("a + b =" + (a / b));
		System.out.println("a + b =" + (a % b));
		//取余数
		
		//关系运算
		System.out.println("a > b =" + (a > b));
		System.out.println("a >= b =" + (a >= b));
		System.out.println("a == b =" + (a == b));
		System.out.println("a < b =" + (a < b));
		System.out.println("a <= b =" + (a <= b));
		System.out.println("a != b =" + (a != b));
		
		//逻辑运算
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		System.out.println("b1 == :" + b1);
		System.out.println("b2 == :" + b2);
		System.out.println("b1 && b2 :" + (b1 && b2)); //与
		System.out.println("b1 || b2 :" + (b1 || b2)); //或
		System.out.println("!b2 :" + (!b2)); //取反
		System.out.println("b1 && b3 :" + (b1 && b2)); //与
		System.out.println("b1 || b3 :" + (b1 || b2)); //或
		
	}

}
