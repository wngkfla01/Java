package sub2;

public class ClassTest {
	public static void main(String[] args) {
		
		//국민은행 객체생성 및 초기화
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);
				
		//입금, 출금, 조회하기
		kb.deposit(10000);
		kb.withdraw(5000);
		// kb.money--; // 객체의 멤버변수의 캡슐화를 통한 취약코드 예방
		kb.info();
		
		//신한은행 객체생성 및 초기화
		Account sh = new Account("신한은행", "131-45-7689", "장보고", 30000);
		
		//입금, 출금, 조회하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
	}
}