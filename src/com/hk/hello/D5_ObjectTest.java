package com.hk.hello;

public class D5_ObjectTest {
	public static void main(String[] args) {
		String str=new String();
		System.out.println(str.getClass());//클래스의 위치와 이름
		
		D5_ClassTest classTest= new D5_ClassTest();
		System.out.println(classTest.getClass());
		
		//문자열로 반환해준다. : 객체일경우 "위치@hashcode" 반환해준다
		System.out.println(classTest.toString());
		
		//기본타입일 경우 값을 문자열로 반환한다
		int a=10;
		Integer ii=10;//Integer는 wrapper클래스임
		System.out.println(ii.toString());
		
		D5_ClassTest classTest2=new D5_ClassTest();
		
		System.out.println(classTest.hashCode());
		System.out.println(classTest2.hashCode());
		
		//equals: 참조타입을 비교할때 --> hashcode로 비교한다 ->> hashcode()
		System.out.println(classTest.equals(classTest2));
	  //equals는 문자열 비교할때 주로 쓰인다.
	   //리터럴 방식, 객체 방식
		//리터럴로 선언해서 사용했을 경우
	   String s="a";
	   String ss="a";
	   System.out.println(s==ss);//주소로 비교
	   System.out.println(s.equals(ss));//해쉬코드로 비교
	   
	   //객체생성해서 사용했을 경우
	   String sss= new String("a");
	   System.out.println(s==sss);//주소로 비교
	   System.out.println(s.equals(sss));//해쉬코드로 비교
	}
	
}
