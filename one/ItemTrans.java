package com.one;

public class ItemTrans {
	private int jPoint;
	
	public int getjPoint() {
		return jPoint;
	}

	public void getItem(String str) {
		if (str.equals("����")) {
			jPoint=1000;
		}
		else if (str.equals("��������")) {
			jPoint=3000;
		}
		else if (str.equals("����ų")) {
			jPoint=5000;
		}
		else {
			jPoint=0;
		}
	}
}
