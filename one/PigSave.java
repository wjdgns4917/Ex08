package com.one;

public class PigSave {
	int total;
	
	public void getTotal() {
		System.out.println("total : "+total);
	}
	public int getTotalRtn() {
		return total;
	}
	public void deposit(int amount) {
		System.out.println(amount+"�� �Ա�");
		total=total+amount;

	}

}
