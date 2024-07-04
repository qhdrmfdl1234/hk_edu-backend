package com.hk.hello;

public class D1_ControlFlow {

	public static void main(String[] args) {
		//if문
		//3가지 유형
		//1. if(조건식){실행코드}
		//2. if(조건시){실행코드}else{실행코드}
		//3. if(조건식){실행코드}else if(조건식){실행코드}else if(조건)..
		
		int num1=10;
		int num2=5;
		//if문을 독립적으로 사용 :if 문끼리 영향 없음
		if(num1>num2) {
			System.out.println("실행결과:"+num1+">"+num2);
		}
		
		if(num1>num2) {
			System.out.println("실행결과:"+num1+">"+num2);
		}
		
		if(num1>num2) {
			System.out.println("실행결과"+num1+">"+num2);
		}else {
			System.out.println("실행결과"+num2+"<"+num2);
		}
		//여러 조건을 설정한다면..
		if(num1>num2) {
			if(num1!=num2) {//조건문을 중첩해서 사용..
		}else if(num1<num2) {
			
		}else if(num1==num2) {
	
	
		}else {
	
		}
		}
		
		
		
		//switch case문
		int num=10;
		switch (num) {
			case 1: System.out.println("1입니다");break;
			case 2: System.out.println("2입니다");break;
			case 3: System.out.println("3입니다");break;
			case 4: System.out.println("4입니다");break;
			case 5: System.out.println("5입니다");break;
			case 6: System.out.println("6입니다");break;
			default:System.out.println("일치하는 값이 없습니다");
				break;
		}
		//제어문(반복문)
		//for문 : 기본형식(index기반의 실행), 향상된 for문
		for(int i = 0; i<10 ; i++) {
			if(i==3) {
				break;//가장 가까운 반복문을 빠져나온다
				//continue//가장 가까운 반복문으로 다시 돌아간다.
			
			}
			System.out.println(i);
		}
		
		//향상된 for문
		//배열: 어떤 값의 나열 --> 자바에서는 같은 타입의 나열
		int[] i = {1,2,3,4,5};
		//   (초기값: 사용될 객체)
		for(int j:i) {
			System.out.println(j);//자동으로 index에 해당하는 값을 가져온다.		
		}
		for(int j=0 ;j<i.length;j++) {
			System.out.println(i[j]);//index를 통해 값을 가져온다
		}
		
		//while문: 반드시 반복문을 빠져나가는 코드처리가 필요
	}
}
