package com.hk.hello;
import java.util.*;
public class D4_GCD {

	public static void main(String[] args) {
		System.out.println("최대공약수를 구할 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int gcd1 = sc.nextInt();
		int gcd2 = sc.nextInt();
		int i = ggcd(gcd1,gcd2);
		System.out.println("최대공약수는"+i);
		greateDivisor(10,30);

	}
	public static int ggcd(int a,int b) { //1번 방법 : 유클리드호제
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            
        }
        return a;
		
	}
	public static void greateDivisor(int a, int b) { //2번 방법 뺴서
		
		int tempA=a;
		int tempB=b;
		
		while(true) {
			//a가 b보다 클 경우
			if(a>b) {
				a=a-b;
			}
			//b가 a보다 클 경우
			if(b>a) {
				b=b-a;
			}
			//a와 b가 같을 경우 //while문을 종료하는 코드
			if(a==b) {
				break;
			}
		}
		System.out.println(tempA+"와"+tempB+"최대공약수는"+a+"입니다");
	}

}
