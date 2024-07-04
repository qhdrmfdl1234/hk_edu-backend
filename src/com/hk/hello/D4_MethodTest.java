package com.hk.hello;

public class D4_MethodTest {

	public static void main(String[] args) {
		D4_MethodTest mt = new D4_MethodTest();
		mt.test01();
		int result = test05(5,10);//메서드에 저장된 값은 실행후 삭제된다 그래서 변수에 다시 저장해야 사용할 수 있다.
		
	}
	
	//메서드 유형
	//1. static과 non-static
	//static 메서드
	public static void test01() {
		System.out.println("static 메소드");
	}
	//non-static 메서드
	public void test2() {
		System.out.println("non-static 메서드");
	}
	//2. 반환타입o /반환타입x
	public int test03() {
		return 0; // 반환타입을 선언했다면 반드시 return 값을 정의해야한다.
	}
	public void test04() {
		//return0 //반환하면 오류 남
	}
	//3.파라미터 o/x : 메서드의 외부로부터 값을 전달받아서 처리할 경우 
	public static int test05(int a, int b) {
		int result=a+b;
		System.out.println(result);
		return result;
		
	}

}
