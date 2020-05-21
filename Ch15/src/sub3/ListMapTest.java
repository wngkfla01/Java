package sub3;
/*
 * ��¥ : 2020/05/20
 * �̸� : ���ϸ�
 * ���� : ����Ʈ�� �� �÷��� ���� �ǽ��ϱ�
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sub1.Apple;

public class ListMapTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> map1 = new HashMap<>();
		map1.put(101,  new Apple("�ѱ�", 3000));
		map1.put(102,  new Apple("�߱�", 2500));
		map1.put(103,  new Apple("�Ϻ�", 2000));
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(201,  new Apple("�̱�", 3000));
		map2.put(202,  new Apple("����", 2500));
		map2.put(203,  new Apple("ȣ��", 2000));
		
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(301,  new Apple("�븸", 3000));
		map3.put(302,  new Apple("�±�", 2500));
		map3.put(303,  new Apple("ȫ��", 2000));
		
		// ����Ʈ�� �� ����
		list.add(map1);
		list.add(map2);
		list.add(map3);		
		
		//�ѱ���� ���
		Map<Integer, Apple> m1 = list.get(0);
		Apple a1 = m1.get(101);
		a1.show();
		
		//ȣ�ֻ�� ���
		list.get(1).get(203).show();
		
		//�±���� ���
		list.get(2).get(302).show();
		
		
		
		
		
		
		
		
		
		
	}

}
