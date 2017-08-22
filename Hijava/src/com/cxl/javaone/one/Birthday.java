package com.cxl.javaone.one;

public class Birthday {
	private int day;
	private int month;
	private int year;
	
	public void displayer(int year,int month,int day) {
		day = 11;
		month = 11;
		year = 2015;
		System.out.println("传递的方法中:" + year + "_" + month + "_" + day);
	}
   public void displayer(Birthday birthday) {
	   // 按下Ctrl，將鼠標移動到方法名上，會變成一個超鏈接，打擊可以跳到方法內部。
	   birthday.day = 12;
	   birthday.month = 12;
	   birthday.year = 2012;
	   System.out.println("引用传递的方法中:" + birthday.year + "_" + birthday.month + "_" + birthday.day) ;
	   
			   
   }
   public static void testValue1() {
	   Birthday birthday = new Birthday();
	   int year = 2017;
	   int month = 12;
	   int day = 12;
	   System.out.println("传递之前:" + year + "_" + month + "_" + day);
	   birthday.displayer(year,month,day);
	   System.out.println("传递之后:" + year + "_" + month + "_" + day);
			   
   }
   public static void testValue2() {
	   Birthday birthday = new Birthday();
	   birthday.year = 2017;
	   birthday.month = 3;
	   birthday.day = 3;
	   System.out.println("引用传递之前:" + birthday.year + "_" + birthday.month + "_" + birthday.day);
	   birthday.displayer(birthday);
	   System.out.println("引用传递之后:" + birthday.year + "_" + birthday.month + "_" + birthday.day);
			   
   }
	public static void main(String[] args) {
       testValue1();
       testValue2();
       // 結論：基本數據類型作為方法實參傳遞，在方法內重新賦值，離開方法后失效
       // 如果是引用類型傳遞，在方法內修了對象的屬性值，則真改變
	}

}
