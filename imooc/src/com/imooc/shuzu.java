package com.imooc;

import java.util.Scanner;

//�����������顣
public class shuzu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("�������һ������");
		 int a = sc.nextInt();
		 System.out.println("������ڶ�������");
		 int b = sc.nextInt();
		 int c = sum(a,b);
		 System.out.println("a+b="+c);
		 
	}
	
	public static int sum(int a,int b) {
		int c = a+b;
		return c;
	}
}
