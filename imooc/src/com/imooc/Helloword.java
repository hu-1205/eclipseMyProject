package com.imooc;
import java.util.Random;
import java.util.Scanner;
public class Helloword {
	public static void main(String[] args){
		
		//创建对象
		Random r = new Random();
		
		//引用随机常量
		
		int number = r.nextInt(100)+1;
		
		while(true) {
//			Scanner sa = new Scanner(System.in);
//			int guess = sa.nextInt();
//			
//			//创建对象
//			System.out.println(guess);
//			
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入你要猜的数字：");
			//输入创建对象
			
			int guessNumber = sc.nextInt();
			if(guessNumber>number) {
				System.out.println("输入数字过大请重新输入！");
			}else if(guessNumber<number) {
				System.out.println("输入数字过小请重新输入！");
			}else {
				System.out.println(guessNumber+"输入正确！");
				break;
			}
		}


	}
}
