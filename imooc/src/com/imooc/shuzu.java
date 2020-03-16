package com.imooc;

import java.util.Scanner;

//方法遍历数组。
public class shuzu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("请输入第一个数据");
		 int a = sc.nextInt();
		 System.out.println("请输入第二个数据");
		 int b = sc.nextInt();
		 int c = sum(a,b);
		 System.out.println("a+b="+c);
		 
	}
	
	public static int sum(int a,int b) {
		int c = a+b;
		return c;
	}
}
