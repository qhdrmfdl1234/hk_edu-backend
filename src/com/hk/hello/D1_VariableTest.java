package com.hk.hello;

public class D1_VariableTest {
	public static void main(String[] args) {
		
	// 기본타입의 특징 
	// 1. 정수타입
		byte b=1;// byte는 -128~127까지 숫자를 표현 
		byte c =127;
		//byte d=128; 오류 / 128은 표현범위를 벗어남
		short sh = 128; // 2byte니까 저장할 수 있음
		int i = 1000000000; //4byte 최대자리수 10자리
		long l = 5000000000000000000L;//8byte 최대자리수 19 정수리터럴에서 기본형이 int이기때문에 리터럴 값이 범위를 벗어나면 오류 따라서 L 붙여줘야
		
	// 2. 실수타입
		double d= 15.8; // 8byte 최대 19자리
		float f = 12.7f; // 4byte 최대 10자리 실수리터럴에서 기본형이 double이기 때문에 
		float k = (float)12.7; // 위처럼 해도 되고 아니면 캐스팅을 해도 됌
		float ff = (float)(d + f);  // 다른 타입의 두 변수를 연산하면 큰쪽의 타입으로 변환
	// 3. 다른 타입끼리 연산	
		int ii= (int)(i+d); // int + double = double반환
		double dd = i+d;
		int iii=(int)dd; //dd double --> int형 변환 예) 12.3 --> 12
		
	// 4. 정수끼리 연산
		byte b1 =10;
		byte b2 =20;
		byte b3 = (int)(b1+b2);//byte끼리해도 int형으로 변환
	}
}
