package com.one;

public class Student {
	private String pass;
	
	public String getPass() {
		return pass;
	}

	public void getName(String name) {
		System.out.println("�̸� : "+name);
		if (name.equals("ȫ�浿")) {
			pass="111";
		}
		else if (name.equals("ȫ���")) {
			pass="222";
		}
	}
}
