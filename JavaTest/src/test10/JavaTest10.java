package test10;

/*
 * 날짜 : 2020.05.01
 * 이름 : 주하림
 * 내용 : 자바 피보나치 수열 연습문제
 */

public class JavaTest10 {
	public static void main(String[] args) {
		
		int n1=1;
		int n2=2;
		int n3;
		
		System.out.print(n1+",");
		System.out.print(n2+",");
		
		for (int i = 0; i <= 9; i++) {
			n3=n1+n2;   //피보나치 수열 공식
			System.out.print(n3+",");
			
			n1=n2;
			n2=n3;
			
		}
	}

}
