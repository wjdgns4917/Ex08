package com.three;

public class CarTest extends Car{
	public static void main(String[] args) {
		//CarClass �θ�Ŭ������ �������� ���볻�� �߰�
		//Benz, Sonata�� CarClass�� ��ӹ޾Ƽ� �ٵ�����,����
		SonataClass sc=new SonataClass();
		sc.body();
		BenzClass bc=new BenzClass();
		bc.body();
	}
}
