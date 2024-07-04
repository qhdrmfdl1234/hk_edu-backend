package com.hk.hello;

public class IfExample2 {

	public static void main(String[] args) {
		int age =9;
		int charge;
		
		if(age<8) {
			System.out.println("취학 전 아동입니다");
			charge =100;
		}
		else if(age<14) {
			charge =2000;
			System.out.println("초등학생입니다");
		}
		else if(age<17) {
			charge =2500;
			System.out.println("중학생 입니다");
		}
		else if(age<20) {
			charge =3000;
			System.out.println("고등학생 입니다");
		}
		else {
			charge =3000;
			System.out.println("일반인입니다");
		}
		
		System.out.println(charge);
	

	}

}
