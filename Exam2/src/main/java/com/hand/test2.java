package com.hand;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in );
		int a=scanner.nextInt();
		double b;//a������Ĺ��ʡ�b�ǲ�
	    b=a-3500;
		int c;//
		System.out.println("�������"+a);
		if(b<=0){
			System.out.println(" Ӧ��Ҫ���ɵ�˰��0");
		}else if(b<=1500){
			System.out.println(" Ӧ��Ҫ���ɵ�˰��"+(b*0.03));
		}else if(b>1500&&b<=4500){
			System.out.println(" Ӧ��Ҫ���ɵ�˰��"+(b*0.1));
		}else if(b>4500&&b<=9000){
			System.out.println("Ӧ��Ҫ���ɵ�˰��"+(b*0.2));
		}else if(b>9000&&b<=35000){
			System.out.println(" Ӧ��Ҫ���ɵ�˰��"+(b*0.25));
		}else if(b>35000&&b<=55000){
			System.out.println(" Ӧ��Ҫ���ɵ�˰��"+(b*0.30));
		}else if(b>55000&&b<=80000){
			System.out.println("Ӧ��Ҫ���ɵ�˰��"+(b*0.35));
		}else if(b>80000){
			System.out.println(" Ӧ��Ҫ���ɵ�˰��"+(b*0.45));
		}
	}

}
