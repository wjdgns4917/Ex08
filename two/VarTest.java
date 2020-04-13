package com.two;

public class VarTest {
	int x,y;
	boolean flag;
	public static void main(String[] args) {
		int a,b;
//		초기화 되지않은 필드를 출력
		VarTest vt=new VarTest();
		vt.print();
	}
	public void print() {
		int a=3,b=5;
		System.out.println(x+", "+y);
		System.out.println("flag : "+flag);
		System.out.println(a+", "+b);
	}
}
