package com.one;

public class JumpTest {
	public static void main(String[] args) {
		ItemTrans its=new ItemTrans();
//		���� -- 1000
//		�������� -- 3000
//		����ų -- 5000
//		��Ÿ -- ����
		its.getItem("����");
		System.out.println("���� ����Ʈ :"+its.getjPoint());
		
		its.getItem("��������");
		System.out.println("�������� ����Ʈ :"+its.getjPoint());
		
		its.getItem("����ų");
		System.out.println("����ų ����Ʈ :"+its.getjPoint());
		
		its.getItem("��Ÿ");
		System.out.println("��Ÿ ����Ʈ :"+its.getjPoint());
	}
}
