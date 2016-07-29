package com.hand;


import java.util.Scanner;

/*输入某年某月某日，判断这一天是这一年的第几天？
从控制台读取日期,日期输入的格式为”2015-07-26”形式.(不允 许使用 Calendar,Date,DateTime 类中的函数),
输入输出的形式 如下:2 请输入日期:2015-01-01 你输入的日期为当年的第 1 天*/
public class test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入日期，格式为：2015-07-26,您输入的是：");
		String riqi = scanner.next();//
		String[] arr = riqi.split("-");
		int year = Integer.parseInt(arr[0]);
		int mouth = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		int day1 = 0; // 天数
		if (year % 400 == 0 && year % 100 != 0 || year % 100 == 0) { // 判断是否为闰年
			int[] mouth1 = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 闰年里的每个月的天数

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
		System.out.println("这一天是这一年的第" + day1 + "天！");
	}
}