package com.one;

public class PigSaveTest {

	public static void main(String[] args) {
		PigSave save=new PigSave();
		save.deposit(100);
		save.deposit(500);
		save.deposit(10000);
		save.deposit(10000);
		
		//저축 총액 출력
		save.getTotal();
//		save.getTotal(); //.return 이용
		System.out.println("총액 : "+save.getTotalRtn());
	}

}
