package sub2;

/*
 * ��¥ : 2020/05/01
 * �̸� : ���ϸ�
 * ���� : �ݺ��� for �ǽ��ϱ�
 *  
 */

public class ForTest {
	public static void main(String[] args) {
		
		
		
		//for
		//for(�ʱ�� ; ���ǽ� ; ������){}
		for(int i=1 ; i<=3 ; i++) {
			
			System.out.println("Hello Java!");
		
		}
	
		
		
		
		//1���� 10���� ��
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
			
			sum += k;     //sum = sum+k ���µ�, ���մ��Կ����ڷ� �����ϰ� �ٲ�
		
		}
		System.out.println("1���� 10���� �� : "+sum);
	
		
		
		
		//1���� 10���� ¦����
		int eSum=0;
		
		for (int k = 1; k <=10; k++) {
			
			if (k%2==0) {
				eSum +=k;
			}			
		}
		System.out.println("1���� 10���� ¦�� �� : "+eSum);
		
		
		
		
		//���� for��
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : "+a);
			
			for(int b=1; b<=5; b++) {				
				System.out.println("b : "+b);				
			}
		}
		
		
		
		
		//������
		for(int x=2; x<=9; x++) {
			System.out.println(x+"��");
			
			for(int y=1; y<=9; y++) {
				
				int z = x * y;
				System.out.println(x+" x "+y+" = "+z);
				
			}
		}
		//�� �ﰢ�� I
		//�� �ﰢ�� II
		
	
	
	
	
	
	}

}