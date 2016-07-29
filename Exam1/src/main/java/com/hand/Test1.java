package com.hand; 

import java.util.ArrayList;
import java.util.List;


public class Test1 {
	public static void main(String[] args) {
		int count = 0;
		boolean b = false;
		List<Integer> list = new ArrayList();
		for (int i = 101; i < 200; i += 2) {
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				count++;
				list.add(i);
				
			}	
		}
		System.out.println("101-200 间总共有"+count+"个素数，分别是：");
		for(Integer i : list){
			System.out.print(i+",");
		}
	}
}
