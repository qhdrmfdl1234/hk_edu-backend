package com.hk.hello;

public class D2_Gugudan {

	public static void main(String[] args) {
		//D1_ControlFlow control=new D1_ControlFlow();
		
		//구구단 출력하기
		//2단 출력:
		for(int i=1; i<=9; i++) {
			System.out.println("2X"+i+"="+(2*i));
			System.out.printf("2x%d=%d",i,(2*i));
		}
		//2~9단 출력하기 
		 for(int i=2; i<10 ;i++) {
			 for(int j=1;j<10;j++) {
				 System.out.println(i+"*"+j+"="+i*j);
			 }
		 }
		//2~9단 까지 출력하는데 이때 짝수단만 출력하기
		 for(int i=2; i<10 ;i++) {
			 for(int j=1;j<10;j++) {
				 if(i%2==0) {
				 System.out.println(i+"*"+j+"="+i*j);}
				 
			 }
		 }
		//2~9단 까지 출력하는데 이때 홀수단만 출력하기
		 for(int i=2; i<10 ;i++) {
			 for(int j=1;j<10;j++) {
				 if(i%3==0) {
				 System.out.println(i+"*"+j+"="+i*j);}
				 
			 }
			 
			 //1~100까지 정수의 총합을 출력하자.
			 // 1 2 3 4...100
			 //1+2+3+4...+100 총합
			 
			 //1~100까지 정수 중 3의 배수의 총합을 출력하자
			 
			 int p=0;
			 for(int l=1;l<=100;l++) {
				 p+=l;
			 }
			 System.out.println(p);
			 
			 int u=0;
			 for(int y=1;y<=100;y++) {
				 if(y%3==0) {
					 u+=y; 
				 }
			
			 }
			 System.out.println(u);
			 
			 /*주사위 두개의 합이 5이상이면 실행을 멈추고, 5가 아니면 계속 실행하는 코드를 작성하자 
			  * 실행결과 출력하기 : (2,5) (1,3) (4,3)..
			  * 1~6까지의 숫자로 구성되며 프로그램상에서는 랜덤하게 숫자가 생성되도록 해야함
			  * Math 객체에서 random()메서드를 사용하면 랜덤한 숫자를 얻을 수 있음
			  */
			 /*int number = (int)Math.random();
			 System.out.println("랜덤숫자생성" + number);
			 //우리가 필요한 숫자는 1~6
			 number=(int)(Math.random()*6+1);//0~1사이 *6 1*6=6
			                                 //5.9999999+1 =6.999999999..
			 */
			 while(true) {
				 int num1=(int)(Math.random()*6+1);
			 	 int num2=(int)(Math.random()*6+1);
			 	 System.out.printf("(%d,%d)\n",num1,num2);
			 	 if(num1+num2==5) {
			 		 System.out.println("합이 5가되어 종료");
			 		 break;
			 	 }
			 }
			 }
			 
		 }
		 
		 
		 
	}


