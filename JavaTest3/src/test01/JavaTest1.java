package test01;

/*
 * 날짜 : 2020/05/13
 * 이름 : 주하림
 * 내용 : 자바 클래스 연습문제
 */

public class JavaTest1 {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		const obj = new ();
		obj.setName("홍길동");
		
		System.out.println(obj.getName());
	}

}
