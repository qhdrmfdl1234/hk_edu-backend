package com.hk.hello;
import java.util.*;
public class D4_LCM {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("최소공배수의 값을 입력하시오");
	int k = sc.nextInt();
	int e = sc.nextInt();
	int ei = lcm(k,e);
	System.out.println(ei);
	
	
	
	}
	public static int lcm(int a, int b) {
		int k =a*b;
		int p = k / D4_GCD.ggcd(a, b);
		return p;
	} 
}
