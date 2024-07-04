package com.hk.hello;

public class D5_ClassTest {
	
	//멤버필드 : 클래스에 저장해서 사용하는 변수
	public int number;//인스턴스 변수
	public static int staticNumber;//클래스 변수 : 공용으로 사용
	
	//기본생성자 : default 생성자라고 함, 파라미터가 없음, 생략 가능, 클래스의 초기화 작업을 수행 
	public D5_ClassTest() {
		//초기화 관련된 코드가 작성됨
		super(); //super 부모클래스를 의미한다.-> 여기서는 부모의 생성자를 의미
		this.number=5;//초기값 설정할 수 있다. this는 자기자신(현재 클래스를 의미)
		System.out.println("default생성자 실행됨");
	}
	public D5_ClassTest(int a) {}
	//메서드: 기능구현 
	//호출: 객체명.메서드()
	public void methodTest() {
		System.out.println("클래스 내부에 기능을 정의한다.:메서드");
	}
	public static void staticMethodTest() {
		System.out.println("static 메모리에 이미 생성되어 사용되는 메서드");
	}
	
	public static void main(String[] args) {
		

	}

}
