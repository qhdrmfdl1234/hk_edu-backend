package com.hk.hello;

public class D5_ClassMain {

	public static void main(String[] args) {
		//참조타입
		D5_ClassTest classTest=new D5_ClassTest(); //heap 메모리에 생성
		classTest.methodTest();//객체명.메서드()호출
		D5_ClassTest.staticMethodTest();//정적메서드 클래스명.메서드()호출
		
		//객체2
		D5_ClassTest classTest2=new D5_ClassTest();
		classTest2.methodTest();
		classTest2.number=19;
		int number2=classTest2.number;
		
		//인스턴스 변수: 객체 각각에 대해서 관리가 되기떄문에 서로 영향을 받지 않는다.
		
		classTest.number=30;
		System.out.println(classTest.number+":"+classTest2.number);
		
		//클래스 변수 : 객체끼리 하나의 변수를 공유하고 있어서 서로 영향을 받는다.
		classTest.staticNumber=30;
		System.out.println("클래스변수"+classTest2.staticNumber);
	}

}
