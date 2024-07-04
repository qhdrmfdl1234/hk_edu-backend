package com.hk.hello;

public class D5_ConstructorTest {
	  public static void main(String[] args) {
	      
	      D5_ConstructorTest con = new D5_ConstructorTest();
	      System.out.println(con.getSize());
	      
	      D5_ConstructorTest con2 = new D5_ConstructorTest(40);
	      System.out.println(con2.getSize());
	      
	      D5_ConstructorTest con3 = new D5_ConstructorTest(30, "빨강");
	      System.out.println(con3.getSize());
	      System.out.println(con3.color);
	      
	   }
	   
	   //티비객체
	   private int size = 0; //중요한 객체인 경우 프라이빗 선언
	   public String color = "검정색"; //색상 
	   
	   //디펄트 생성자는 단독으로 사용할 때는 생략이 가능하지만 오버로딩하면 생략이 안 돼 
	    public D5_ConstructorTest() {
	      // TODO Auto-generated constructor stub
	       //super(); // 부모의 생성자를 호출 (이 코드는 반드시 첫줄에 작성한다)
	       this(2);//super()와 this()는 같이 쓸 수 없다
	               // -> 생성자는 하나만 생성되기 떄문에 this(2)를 쓰는 순간
	               // 파라미터 1개짜리 생성자가 실행된다
	               //그래서 현재 default생성자에 코드들은 실행되면 안된다.
	       this.size = 60;
	       
	   }    
	   
	   // 생성자 오버로딩 (파라미터 1개짜리)
	    public D5_ConstructorTest(int size) { // 생성자를 오버로딩 했으면 기본 생성자가 없으면 안 돼 진짜 쓰고 싶으면 작성을 해야 돼 
	       super();
	       this.size = size;
	       
	       
	       
	       
	} 
	    D5_ConstructorTest(int size, String color){
	       
	       this.size = size;
	       this.color=color;
	       
	    }
	    
	    //값을 가져오기
	    public int getSize() {
	       return size;
	    }
	    
	    public void setSize(int size) {
	       this.size = size;
	    }
	   

	}

