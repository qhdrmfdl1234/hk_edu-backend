package day6;

import java.util.Arrays;

public class D2_FinalTest extends D2_parentTest {
	
	public static void main(String[] args) {
		//값 변경이 안되는 경우 만들기
		int a =5;
		    a=10;// 변경가능
		final int B=10;
		B=5;// 값을 변경할 수 없음 
		
		
		//메서드에 아규먼트로 전달해서 실행,,
		D2_FinalTest ft = new D2_FinalTest();
		ft.test01(10);
		
		//참조타입 배열에서 값을 바꿔보기
		ArrayA[0]=10;
		System.out.println(Arrays.toString(ArrayA));
		//ArrayA=new int[] {4,5};// 주소값 변경 금지 
		
		
		
		
	}
	public int test01(int value) {
		final int aa=value;
		return 0;
	}
	//멤버필드에 정의 사용
	public static final int A=10; //멤버필드에서 정의해서 사용할때는 값까지 넣어서 
	//  참조타입 중 배열 선언 : 참조값은 주소를 저장한다 -> final쓰면 주소변경 금지 -> 값은 변경가능
	public static final int [] ArrayA={1,2,3,4,5};
	
	
	
	
	//메서드에 final 사용하면 오버라이딩 금지
//	public void test() {
	//	System.out.println("자식에서 다시 정의했어요");
//	}
}

//final 클래스에 붙이면 상속금지 , 메서드에 붙이면 오버라이딩 금지
