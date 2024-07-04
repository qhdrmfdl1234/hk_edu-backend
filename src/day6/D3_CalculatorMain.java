package day6;

public class D3_CalculatorMain {

	public static void main(String[] args) {
	//	D3_CalculatorA cal = new D3_CalculatorA(5,10);
	//	cal.a();//덧셈연산 실행
		//System.out.println("계산결과"+cal.getResult());
		
		int num1=20;
		int num2=10;
		String calcu="-";
		
		D3_CalculatorCompare cal=new D3_CalculatorCompare();
		cal.claculator(num1, num2, calcu);
		System.out.printf("%d와%d의 %s 계산 결과: %d \n",num1,num2,calcu,cal.getResult());
	}

}
