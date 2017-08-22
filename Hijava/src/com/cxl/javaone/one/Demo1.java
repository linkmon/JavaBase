package com.cxl.javaone.one;

public class Demo1 {

	public static void main(String[] args) {
		// 三目运算符
		int num = 9 , num2 = 5;
		int num3 = num < num2 ? num : num2;
		// 如果？前面的表达式的值为真，就取：前面的值，否则取：后面的值
		System.out.println(num3);
		
		//字符串操作符
		String str1 = " anhui";
		String str2 = " hefei";
		int code = 35;
		String result = str1 + str2 +code + "号";
		System.out.println("result :" + result);
		
		
		//类型转换操作符
		int i = 15;
		byte j = (byte) i;//如果前面出现X号，单击会出现
		System.out.println("i =" + i);
		System.out.println("j =" + j);
		
		
		//自增自减
		int age1 = 5;
		int count;
		System.out.println("age1 =" + age1);
		count = 2 * age1++; //先使用后增加
		System.out.println("count =" + count);
		System.out.println("age1 =" + age1);
		age1--; //先使用后减少
		System.out.println("age1 =" + age1);
		
		int age2 = 10;
		int c2 ;
		c2 = 2 * --age2;//先自减再参与运算
		System.out.println("c2 = " + c2);
		System.out.println("age2 =" + age2);
		c2 = 2 * ++age2;
		System.out.println("c2 = " + c2); //先自增再参与运算
		System.out.println("age2 =" + age2);
		
		//扩展赋值运算
		int a = 8;
		a /= 4; //等效于a = a / 4
		System.out.println("a =" + a);
		a += 5; //等效于a = a + 5
	    a *= 6; //等效于a = a * 5
	}

}
