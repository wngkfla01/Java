package sub1;

import java.util.ArrayList;
import java.util.List;

/*
 * ��¥ : 2020/05/20
 * �̸� : ���ϸ�
 * ���� : �÷��� �����ӿ�ũ �ǽ��ϱ� ���� p724
 */

public class ListTest {
	public static void main(String[] args) {
		
		//����Ʈ ���� �� ���� ������ ����
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		list1.add(0, 3);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.printf("list1�� %d��° ���� : %d\n", i+1, list1.get(i));
		}
		
		//����Ʈ ���� �� ���ڿ� ������ ����
		List<String> list2 = new ArrayList<>();
		list2.add("������");
		list2.add("������");
		list2.add("�庸��");
		list2.add("������");
		list2.add("�̼���");
		
		for(String name : list2) {
			System.out.println("name : "+name);
		}
		
		//����Ʈ ���� �� ��� �����͸� ����
		List<Apple> list3 = new ArrayList<>();
		list3.add(new Apple("�ѱ�", 3000));
		list3.add(new Apple("�̱�", 2000));
		list3.add(new Apple("�Ϻ�", 2500));
		
		//�ѱ���� ���
		Apple a1 = list3.get(1);
		a1.show();
		
		//�̱���� ���
		list3.get(1).show();
		
		
	
		
	}

}
