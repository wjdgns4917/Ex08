package com.three;

public class CarTest extends Car{
	public static void main(String[] args) {
		//CarClass 부모클래스로 엔진장착 공통내용 추가
		//Benz, Sonata는 CarClass를 상속받아서 바디장착,생산
		SonataClass sc=new SonataClass();
		sc.body();
		BenzClass bc=new BenzClass();
		bc.body();
	}
}
