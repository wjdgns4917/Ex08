package com.one;

public class PigSaveTest {

	public static void main(String[] args) {
		PigSave save=new PigSave();
		save.deposit(100);
		save.deposit(500);
		save.deposit(10000);
		save.deposit(10000);
		
		//���� �Ѿ� ���
		save.getTotal();
//		save.getTotal(); //.return �̿�
		System.out.println("�Ѿ� : "+save.getTotalRtn());
	}

}
