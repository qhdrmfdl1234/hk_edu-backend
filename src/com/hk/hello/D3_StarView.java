package com.hk.hello;

public class D3_StarView {

	public static void main(String[] args) {
		/*                            a1 + (n-1)*d
		 * 0*       0 + 1 = 1          1 + (0)*1   자바에서는 이미 0부터 시작하니깐 
		 * 1**      1 + 1 = 2          1 + (1)*1   자릿수에서 -1을 할 필요 없음
		 * 2***                        1 + (2)*1
		 * 3**** 
		 * 4*****                   ---> 1+i*1 --> 1+i 일반항을 만들 수 있음
		 */
		/*for (int i = 0; i < 5; i++) {//i는 자릿수
			for(int j =0; j<1+i; j++) {//j는 값
				System.out.print("*");
			}
			System.out.println();//줄바꿈만 해줌
		}
		*/
		//for(int i =0; i < 5; i++) {//i는 자릿수
			//for(int j =0; j<1+i*2;j++) {//j는 값
			//	System.out.print("*");
		//	}
		 //	System.out.println();//줄바꿈만 해줌
		//}
		ㅈㄴ2ㅈ
		/* 2. 오른쪽 삼각형
		 *          *    a1+n*d
		 *         **     4+i*1=4-i 공백을 구하는 일반항 
		 *        ***     
		 *       ****     1+i*1 = 1+i 별을 출력할 일반항
		 *      ***** 
		*/
		for(int i =0;i<5;i++) {
			for(int j=0; j < args.length; j++) { //공백
		}		System.out.println("☆");
			for(int j =0; j<1+i;j++) {//별
				System.out.println("★");
			}
		
		}
	}

}
