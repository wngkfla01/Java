package sub1;

/*
 * 날짜 : 2020/04/29
 * 이름 : 주하림
 * 내용 : 연산자 실습하기
 */

public class OperatorTest {
	public static void main(String[] args) {
		//산술연산자
		int num1=1, num2=2, num3=3, num4=4;
		
		int rs1=num1+num2;
		int rs2=num1-num2;
		int rs3=num3*num2;
		int rs4=num4/num2;
		int rs5=num4%num2; //나눗셈 나머지를 구하는 연산자
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		
		//증감, 감소 연산자
		int n1=1;
		int n2=2;
		
		n1++;
		n2--;
		
		++n1;
		--n2;
		
		System.out.println("n1의 값 : "+n1);
		System.out.println("n2의 값 : "+n2);
		
		//복합대입연산자
		int no1=1, no2=2, no3=3, no4=4;
		
		no1 +=1; // no1 = no1 + 1;
		no2 -=2; // no2 = no2 - 2;
		no3 *=3; // no3 = no3 * 3;
		no4 /=4; // no4 = no4 / 4;
		
		System.out.println("no1 : "+no1);
		System.out.println("no2 : "+no2);
		System.out.println("no3 : "+no3);
		System.out.println("no4 : "+no4);
		
		//비교연산자
		int var1=1;
		int var2=2;
		
		boolean res1=(var1 > var2); // var1이 var2보다 크다.
		boolean res2=(var1 < var2); // var1이 var2보다 작다.
		boolean res3=(var1 >= var2); // var1이 var2보다 크거나 같다.
		boolean res4=(var1 <= var2); // var1이 var2보다 작거나 같다.
		boolean res5=(var1 == var2); // var1이 var2와 서로 같다 .
		boolean res6=(var1 != var2); // var1이 var2와 서로 다르다 .
		
		System.out.println("res1 : "+res1);
		System.out.println("res2 : "+res2);
		System.out.println("res3 : "+res3);
		System.out.println("res4 : "+res4);
		System.out.println("res5 : "+res5);
		System.out.println("res6 : "+res6);
		
		//논리연산자
	}

}
