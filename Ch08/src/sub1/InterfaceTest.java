package sub1;

/*
 * ��¥ : 2020/05/13
 * �̸� : ���ϸ�
 * ���� : �������̽� �ǽ��ϱ�
 */

public class InterfaceTest {
	
	public static void main(String[] args) {
		//�������̽� ���� : Ŭ���� ������ ǥ�� ���̵� ����
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
		
	}

}
