package com.hk.hello;

public class TypeInference {
	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str ="hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str="test";//다른 문자열은 대입가능
		//str = 3; str 변수는 string형으로 먼저 사용되었기 떄문에 정수값 넣을 수 없음
		
	}
}
