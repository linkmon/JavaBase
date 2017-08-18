package com.cxl.javaone.one;

import java.util.Scanner;

public class NameAge {
	
	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("请输入你的姓名");
		
		sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		System.out.println("你的姓名是:" + name );
		
		System.out.println("请输入你的年龄");
		
		String age = sc.nextLine();
		  
		System.out.println("你的年龄是:" + age);

	}

}
