package sub2;

/*
 * 날짜 : 2020/05/01
 * 이름 : 주하림
 * 내용 : 반복문 for 실습하기
 *  
 */

public class ForTest {
	public static void main(String[] args) {
		
		
		
		//for
		//for(초기식 ; 조건식 ; 증감식){}
		for(int i=1 ; i<=3 ; i++) {
			
			System.out.println("Hello Java!");
		
		}
	
		
		
		
		//1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			
			sum += k;     //sum = sum+k 였는데, 복합대입연산자로 간단하게 바꿈
		
		}
		System.out.println("1부터 10까지 합 : "+sum);
	
		
		
		
		//1부터 10까지 짝수합
		int eSum=0;
		
		for (int k = 1; k <=10; k++) {
			
			if (k%2==0) {
				eSum +=k;
			}			
		}
		System.out.println("1부터 10까지 짝수 합 : "+eSum);
		
		
		
		
		//이중 for문
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : "+a);
			
			for(int b=1; b<=5; b++) {				
				System.out.println("b : "+b);				
			}
		}
		
		
		
		
		//구구단
		for(int x=2; x<=9; x++) {
			System.out.println(x+"단");
			
			for(int y=1; y<=9; y++) {
				
				int z = x * y;
				System.out.println(x+" x "+y+" = "+z);
				
			}
		}
		//별 삼각형 I
		//별 삼각형 II
		
	
	
	
	
	
	}

}
