package com.hk.hello;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking =1;
		char medalColor;
		switch(ranking) {
		case 1 : medalColor ='G';
			break;
		case 2 : medalColor ='S';
			break;
		case 3 : medalColor ='B';
			break;
		default:
			medalColor ='a';
		
		}
		System.out.println(ranking + "등 메달의 색갈은"+ medalColor + "입니다");

	}

}
