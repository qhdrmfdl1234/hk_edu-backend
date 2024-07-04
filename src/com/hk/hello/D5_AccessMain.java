package com.hk.hello;

public class D5_AccessMain {

	public static void main(String[] args) {
		D5_AccessTest access=new D5_AccessTest();
		int a=access.a;//public선언: 접근가능
		int b=access.b;//default선언: 접근가능
		//int c=access.c;//private선언: 접근불가능
		int c=access.getc(3);

	}

}
