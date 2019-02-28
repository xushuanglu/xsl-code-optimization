package com.code.optimization;

import java.util.Vector;

public class TestHeapGC {

	public static void main(String[] args) {
//		byte[] b1 = new byte[1024*1024/2];
//		byte[] b2 = new byte[1024*1024*8];
//		
//		b2 = null;
//		b2 = new byte[1024*1024*8];
//		System.gc();
		
		Vector v = new Vector();
		for (int i = 0; i <= 10; i++) {
			byte[] b = new byte[1024 *1024];
			int size = v.size();
			v.add(b);
			if( size == 3) {
				v.clear();
			}
			System.out.println(i + "M is allocated");
		}
		System.out.println("Max memory:" + Runtime.getRuntime().maxMemory()/1024/1024+"M");
		
	}
//	-XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15 -Xms40M
//			-Xmx40M -Xmn20M
	
//	-Xmx13M
	
//	-Xmx13M -Xms11M -verbose:gc
}
