package com.code.optimization;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Object> list = new ArrayList<Object>();
//		List<Object> list1 = new LinkedList<Object>();
		Object o = new Object();
		long start = System.currentTimeMillis();   //获取开始时间
		for (int i = 0; i < 500000; i++) {
			list.add(0,o);
		}
		long end=System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(end-start)+"ms");
		
//		long start1 = System.currentTimeMillis();   //获取开始时间
//		for (int i = 0; i < 500000; i++) {
//			list1.add(0,o);
//		}
//		long end1= System.currentTimeMillis(); //获取结束时间
//		System.out.println("程序运行时间： "+(end1-start1)+"ms");
		 
	}
}
