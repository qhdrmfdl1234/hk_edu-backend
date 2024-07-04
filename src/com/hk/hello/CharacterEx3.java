package com.hk.hello;

public class CharacterEx3 {
	public static void main(String[] args) {
		int a =65;
		int b =-66;
		
		char a2 =65;
		//char a2 = -65; 문자열에 음수를 넣으면 오류발생
		System.out.println((char)a);//다운캐스틍
		System.out.println((char)b);//다운캐스팅
		System.out.println(a2);
	}
}
