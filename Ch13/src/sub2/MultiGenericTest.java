package sub2;
/*
 * 날짜 : 2020/05/20
 * 이름 : 주하림
 * 내용 : 제네릭 클래스 실습하기 교재 p654
 */

public class MultiGenericTest {
	public static void main(String[] args) {
		
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		Product<TV, Integer> p1 = new Product<>(tv, 3000);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
		
	}

}
