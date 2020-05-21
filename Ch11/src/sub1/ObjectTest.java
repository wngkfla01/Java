package sub1;

/*
 * ��¥ : 2020/05/18
 * �̸� : ���ϸ�
 * ���� : Object Ŭ���� �ǽ��ϱ� ���� p457
 * 
 * Object Ŭ����
 *  - �ڹ��� �ֻ��� Ŭ����
 *  - ��� Ŭ������ �θ� Ŭ�����̹Ƿ� ������ ���뿡 Ȱ��ȴ�.
 */

public class ObjectTest {
	public static void main(String[] args) {
		
		Object obj1 = new Apple("�ѱ�", 3000);
		Object obj2 = new Apple("�Ϻ�", 2000);
		Object obj3 = new Banana("�븸", 2500);
		Object obj4 = new Banana("�߱�", 1500);
		
		//toString �޼��带 �������ϸ� �ٿ�ĳ���� X
		obj1.toString();
		obj2.toString();
		
		//�ٿ�ĳ����
		Apple a1 = (Apple) obj1;
		Banana b3 = (Banana) obj3;
		
		a1.info();
		b3.info();
		
		
		// �������� Ȱ��Ǵ� Object Ŭ����
		Object fruit[] = {obj1, obj2, obj3, obj4};
		
		Apple a2 = (Apple) fruit[1];
		Banana b4 = (Banana) fruit[3];
		
		a2.info();
		b4.info();
	}
}
