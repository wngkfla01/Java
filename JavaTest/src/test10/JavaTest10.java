package test10;

/*
 * ��¥ : 2020.05.01
 * �̸� : ���ϸ�
 * ���� : �ڹ� �Ǻ���ġ ���� ��������
 */

public class JavaTest10 {
	public static void main(String[] args) {
		
		int n1=1;
		int n2=2;
		int n3;
		
		System.out.print(n1+",");
		System.out.print(n2+",");
		
		for (int i = 0; i <= 9; i++) {
			n3=n1+n2;   //�Ǻ���ġ ���� ����
			System.out.print(n3+",");
			
			n1=n2;
			n2=n3;
			
		}
	}

}
