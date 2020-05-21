package sub3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * ��¥ : 2020/05/21
 * �̸� : ���ϸ�
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p1032
 */

public class ReaderTest {
	public static void main(String[] args) {
		
		
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		try {
			FileReader fr = new FileReader(file);
			
			int value = 0;
			
			
			
			while(true) {
				value = fr.read();
				
				if(value == -1) {
					break;
				}
				
				char c = (char) value;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
