package sub1;
/*
 * ��¥ : 2020/05/20
 * �̸� : ���ϸ�
 * ���� : ���׸� �ǽ��ϱ� ���� p654
 */

public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("�ѱ�", 3000);
		Banana b = new Banana("�븸", 2000);
		
		FruitBox<Apple> applebox = new FruitBox<>();
		applebox.setFruit(a);
		
		FruitBox<Banana> bananabox = new FruitBox<>();
		bananabox.setFruit(b);
		
		
	}

}
