package com.one;

public class StudentTest {
	public static void main(String[] args) {
		Student stu=new Student();
		
		
		//ȫ�浿�� ���������� ����� 111 �������
		stu.getName("ȫ�浿");
		System.out.println("ȫ�浿 ��� :"+stu.getPass());
		
		//ȫ����� ���������� ����� 222 �������
		stu.getName("ȫ���");
		System.out.println("ȫ�浿 ��� :"+stu.getPass());
	}

}
