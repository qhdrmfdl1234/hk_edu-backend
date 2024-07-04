package com.hk.hello;
//명명법,식별자 확인
//클래스명 : 파스칼(첫글자 대문자로 시작)

public class Hello {//파일명하고 클래스명하고 같아야한다 

	public static void main(String[] args) {
		int t;
		t = 6;
		System.out.println(t);
		testMethod(); //static 메모리에 올려서 호출 할 것 이냐
	    Hello hello = new Hello();// new 이용해 객체 생성이후 호출
	    hello.testMethod();
		
	} //void는 반환타입이 없는 것 만약 반환타입이 필요하면 int등으로 하는 것
	   // 메서드 선언
		//메서드명 정의 : 카멜방식 - 소문자로 시작 
	public static void testMethod() {
		// 변수선언 : 카멜방식 - 소문자로 시작
		// 변수선언 : 타입 + 변수명 = 값
		boolean isS= true;
		int i = 100;
		i = 200; //최종값 200
		System.out.println("메서드 실행"+i);
		
	}
	public void testMethod2() {
		int i = 10;
		if (i<15) {
			int ii= 5;
			ii=ii+i;
		}
	}
}
