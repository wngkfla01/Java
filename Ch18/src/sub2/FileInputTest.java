package sub2;
/*
 * ��¥ : 2020/05/21
 * �̸� : ���ϸ�
 * ���� : �ڹ� ���� ������ �ǽ��ϱ� ���� p1018
 */

import java.io.FileInputStream;

public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		
			try {
				FileInputStream fis = new FileInputStream(file);
				int value = 0;
				
				while(true) {
					value = fis.read();
				
					if(value == -1) {
						//���̻� ���� �����Ͱ� ���� ���
						break;
					}
					
					char c = (char) value;
					System.out.print(value);
				}
				
				// �Է½�Ʈ�� ����
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
			System.out.println("\n���α׷� ����");
		
	}

}
