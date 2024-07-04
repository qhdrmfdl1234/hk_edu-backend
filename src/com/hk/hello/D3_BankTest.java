package com.hk.hello;
import java.util.Scanner;
public class D3_BankTest {

	public static void main(String[] args) {
		//클래스를 객체 생성해서 변수에 저장할때 선언되는 타입 --> 참조타입
		//Scanner scan=new Scanner(System.in); 
	//	System.out.println("키보드로 입력하세요");
		//String s=scan.nextLine();
		//System.out.println("입력된 내용"+s);
		
		//예제
		//while문과 Scanner객체를 이용해서 키보드로부터 입력된 데이터 
		int ur=0;
		int ri=0;
		int sum=0;
		Scanner scan= new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("1.예금/2.출금/3.잔고/4.종료/(뒤로가기:5)");
			System.out.println("--------------------");
			System.out.println("선택>");
			
			if(scan.hasNextInt()) {//입력된 값이 숫자인지 확인한다.
				ur=scan.nextInt();//숫자면 읽는다
			}else {
				System.out.println("숫자를 입력해야합니다");
				scan=new Scanner(System.in);
				continue;
			}
			
		if(ur==1) {
			System.out.println("예금액>");
			int k = scan.nextInt();
			if(k==5) {
				continue;
			}
			else {
				sum+=k;
			}
		}
		else if(ur==2){
			System.out.println("출금액>");
			if(ur<=0) {
				System.out.println("잔액이 없습니다");
			}
			else {
			int r= scan.nextInt();
			sum-=r;
			}
		  }
		
		else if(ur==3) {
			System.out.println("잔고>");
			System.out.println(sum);
		}
		else if(ur==4) {
			System.out.println("프로그램을 종료합니다!!");
			break;
			
		}
		else {
			System.out.println("1~4번까지의 숫자만 입력하세요");
		}
			
		}
	 
	}
}
