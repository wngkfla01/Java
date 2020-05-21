package sub3;

import java.util.HashMap;
import java.util.Map;

import sub1.Apple;

/*
 * ��¥ : 20205/05/20
 * �̸� : ���ϸ�
 * ���� : Map �ǽ��ϱ� ���� p740
 */

public class MapTest {
	public static void main(String[] args) {
		
		// �� ���� �� ���ڿ� ������ ����
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "������");
		map1.put(102, "������");
		map1.put(103, "�庸��");
		map1.put(104, "������");
		map1.put(105, "�̼���");
		
		// ��ü ������ ����
		System.out.println("map1 ������ ���� : "+map1.size());
		
		// �� ���� ���
		String value = map1.get(102);
		System.out.println("map1�� 102�� Ű�� value�� : "+value);
		
		// �� ���� �� ��� ������ ����
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(101, new Apple("�ѱ�", 3000));
		map2.put(102, new Apple("�̱�", 2000));
		map2.put(103, new Apple("�Ϻ�", 2500));
		
		//�ѱ���� ���
		Apple korApple = map2.get(101);
		korApple.show();
		
		//�̱���� ���
		map2.get(102).show();
		
		
		
		
		
		
		
		
		
		
		
	}

}
