package com.two;

public class SeoulSchool extends School{
	public static void main(String[] args) {
		SeoulSchool ss=new SeoulSchool();
		ss.doStudy();
		ss.superCall();
	}
	public void superCall() {
		super.doStudy();
		this.doStudy();
	}
	public void doStudy( ) {
		System.out.println("우리학교 등교시간");
	}
}
