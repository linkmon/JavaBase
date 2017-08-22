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
		
		//短路逻辑运算符
		int aa = 5;//定义一个变量；
        boolean bb = (aa<4)&&(aa++<10);
        System.out.println("使用短路逻辑运算符的结果为"+bb);
        System.out.println("aa的结果为"+aa);
        System.out.println("逻辑或路测试");
        boolean cc = (aa<4)||(aa++<10);
        System.out.println("cc的结果为"+cc);
        System.out.println("aa的结果为"+aa);
		/*
		 * 逻辑与短路，如果第一个位False，后面则不运算
		 * 逻辑或短路，如果第一个为True,后面则不运算
		 */
		
		
	}

}
