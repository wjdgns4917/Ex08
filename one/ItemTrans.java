package com.one;

public class ItemTrans {
	private int jPoint;
	
	public int getjPoint() {
		return jPoint;
	}

	public void getItem(String str) {
		if (str.equals("점프")) {
			jPoint=1000;
		}
		else if (str.equals("더블점프")) {
			jPoint=3000;
		}
		else if (str.equals("적군킬")) {
			jPoint=5000;
		}
		else {
			jPoint=0;
		}
	}
}
