package com.hk.hello;

import java.util.Scanner;

public class D2_isLeapYear {

	public static void main(String[] args) {
		//윤년 : 1년 365 --> 366일(윤년) 2월달의 마지막 날이 28? 29?
		//윤년을 판단하는 조건을 확인 
		// - 년도가 4의 배수이면서 100으로 나누어 떨어지지 않는 수
		// - 또는 400으로 나누어 떨어지는 수

		
		//Scanner s = new Scanner(System.in);
		//int i = s.nextInt();
		for(int i =2001;i<=2030;i++) {
			KI(i);
		}
		
			//if((i%4==0 && i%100 != 0) || i%400==0) {
				//System.out.println(ki()+"은 윤년이다");
		
			
			//else {
				//System.out.println(ki()+"은 윤년이 아니다");}
			
	}
		
	

	
	
	public static void KI(int g) {
		if((g%4==0&&g%100==0)||g%400==0) {
			System.out.println(g+"은 윤년이다");}
		else {
			System.out.println(g+"은 윤년이아니다");
			}
			
	}
}	



