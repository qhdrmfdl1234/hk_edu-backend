package com.hk.hello;
import java.util.*;
public class D4_AmicableNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("구할 친화수를 입력하시오");
	int k = sc.nextInt();
	int t = sc.nextInt();
	an(k,t);
	
	
	}
 
	
	public static void an(int a,int b) { 
		int aa=divisor(a);
		int bb=divisor(b);
		System.out.println(aa);
		System.out.println(bb);
		if(a==bb) {
			if(b==aa) {
				System.out.println("친화수 입니다");
			}
		}
		 
		 }
	
	public static int divisor(int a) {
		int sum=0;
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				if(a!=i) {
					sum+=i;}}
				
				
			}
				
				
			
		return sum;
	
	
	
	
  }
}	