package day6;




//덧셈기능
public class D3_CalculatorA {
	
	//계산할 값 2개를 저장할 멤버필드 선언
	public int num1;
	public int num2;
	
	//계산결과는 중요하니깐 바로 접근할 수 없게 private으로 선언
	private int result;// 결과를 저장할 변수 맴버필드
	
	//default 생성자
	public D3_CalculatorA() {
		//this.num1=10;
		//this.num2=10;
		this(10,10);//기본 초기값을 생성자 오버로딩을 이용해서 초기화할 수 도 있다.
		
	}
	
	//생성자 오버로딩: 연산을 위한 2개의 수를 객체 생성하자마자 필드에 저장한다.
	public D3_CalculatorA(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	//기능 정의 : 뎃셈연산
	public void a() {
		this.result=this.num1+this.num2;//결과값을 필요할때마다 멤버필드에서 가져올 수 있다.
	}
	//public void a() {
	//	this.result=this.num1+this.num2;//결과값을 필요할때마다 멤버필드에서 가져올 수 있다.
	//}
	
	
	
	public static void main(String[] args) {
		

	}

	public int getResult() {
		return this.result;
	}
}
