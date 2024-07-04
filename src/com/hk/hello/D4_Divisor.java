package com.hk.hello;
import java.util.Scanner;
public class D4_Divisor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("약수로 만들 수를 입력하세요");
		int div = sc.nextInt(); 
		divisor(div);
	}
	public static int divisor(int a) {
		for(int i=1; i<=a;i++) {
			if(a%i==0)
				System.out.print((i==a)? i:i+",");
				
			}
		return a;
		}
	}


