package com.one;

public class Student {
	private String pass;
	
	public String getPass() {
		return pass;
	}

	public void getName(String name) {
		System.out.println("ÀÌ¸§ : "+name);
		if (name.equals("È«±æµ¿")) {
			pass="111";
		}
		else if (name.equals("È«±æ¼ø")) {
			pass="222";
		}
	}
}
