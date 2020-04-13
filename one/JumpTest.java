package com.one;

public class JumpTest {
	public static void main(String[] args) {
		ItemTrans its=new ItemTrans();
//		점프 -- 1000
//		더플점프 -- 3000
//		적군킬 -- 5000
//		기타 -- 없음
		its.getItem("점프");
		System.out.println("점프 포인트 :"+its.getjPoint());
		
		its.getItem("더블점프");
		System.out.println("더블점프 포인트 :"+its.getjPoint());
		
		its.getItem("적군킬");
		System.out.println("적군킬 포인트 :"+its.getjPoint());
		
		its.getItem("기타");
		System.out.println("기타 포인트 :"+its.getjPoint());
	}
}
