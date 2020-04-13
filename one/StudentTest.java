package com.one;

public class StudentTest {
	public static void main(String[] args) {
		Student stu=new Student();
		
		
		//홍길동을 전달했을때 비번이 111 리턴출력
		stu.getName("홍길동");
		System.out.println("홍길동 비번 :"+stu.getPass());
		
		//홍길순을 전달했을때 비번은 222 리턴출력
		stu.getName("홍길순");
		System.out.println("홍길동 비번 :"+stu.getPass());
	}

}
