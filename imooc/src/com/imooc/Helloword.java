package com.imooc;
import java.util.Random;
import java.util.Scanner;
public class Helloword {
	public static void main(String[] args){
		
		//��������
		Random r = new Random();
		
		//�����������
		
		int number = r.nextInt(100)+1;
		
		while(true) {
//			Scanner sa = new Scanner(System.in);
//			int guess = sa.nextInt();
//			
//			//��������
//			System.out.println(guess);
//			
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ����֣�");
			//���봴������
			
			int guessNumber = sc.nextInt();
			if(guessNumber>number) {
				System.out.println("�������ֹ������������룡");
			}else if(guessNumber<number) {
				System.out.println("�������ֹ�С���������룡");
			}else {
				System.out.println(guessNumber+"������ȷ��");
				break;
			}
		}


	}
}
