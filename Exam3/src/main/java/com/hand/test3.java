package com.hand;


import java.util.Scanner;

/*����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
�ӿ���̨��ȡ����,��������ĸ�ʽΪ��2015-07-26����ʽ.(���� ��ʹ�� Calendar,Date,DateTime ���еĺ���),
�����������ʽ ����:2 ����������:2015-01-01 �����������Ϊ����ĵ� 1 ��*/
public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������ڣ���ʽΪ��2015-07-26,��������ǣ�");
		String riqi = scanner.next();//
		String[] arr = riqi.split("-");
		int year = Integer.parseInt(arr[0]);
		int mouth = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		int day1 = 0; // ����
		if (year % 400 == 0 && year % 100 != 0 || year % 100 == 0) { // �ж��Ƿ�Ϊ����
			int[] mouth1 = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // �������ÿ���µ�����

			for (int mouth2 = 1; mouth2 <= mouth; mouth2++) {
				if (mouth2 == 1) {
					day1 = day;
				} else {
					day1 += mouth1[mouth2 - 2];
				}
			}
		} else {
			int[] mouth1 = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			for (int mouth2 = 1; mouth2 <= mouth; mouth2++) {
				if (mouth2 == 1) {
					day1 = day;
				} else {
					day1 += mouth1[mouth2 - 2];
				}
			}
		}
		System.out.println("��һ������һ��ĵ�" + day1 + "�죡");
	}
}