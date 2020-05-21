package sub2;
/*
 * ��¥ : 2020/05/20
 * �̸� : ���ϸ�
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p654
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
