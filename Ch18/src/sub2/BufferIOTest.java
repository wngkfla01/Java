package sub2;
/*
 * ��¥ : 2020/05/21
 * �̸� : ���ϸ�
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferIOTest {
	
	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";                                                                                                                                              
		
		// �⺻ ��������� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		// ���۽�Ʈ�� ���� �� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {
			
			// InpuStream���� ������ �о���̱�
			value = bis.read();
			
			if(value == -1) {
				break;
			}
			
			// OutputStream���� ������ ��������
			bos.write(value);
		}
		
		// ��Ʈ�� ����
		bis.close();
		bos.close();
		fis.close();
		fos.close();
		
		
		System.out.println("���α׷� ����");
		
		
	
	}

}
