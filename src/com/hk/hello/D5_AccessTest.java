package com.hk.hello;

public class D5_AccessTest {
	public  int a;//모두 접근가능
			int b;//패키지 내부에서만
   	private int c;//클래스 내부에서만

//메서드
   	public void aa() {

   	}
   			void bb() {

   			}
   	private void cc() {

   	}
   	public int getc(int code) {
   		return c;//클래스 내부에서 접근하기 때문에 가져올 수 있다.
   	}

	public static void main(String[] args) {
		
		//멤버필드
		
	}

}
