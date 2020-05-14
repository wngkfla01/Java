package sub1;

// [�ڹٱ���] �Լ�<<<Ŭ����<<<���̺귯��(xxxx.jar)<<<�����ӿ�ũ(spring)

public class Account {
	// Ư��(�������) 
	// - ���ٱ��� private �������� ������ ĸ��ȭ �Ѵ�.
	// - �ڽ�Ŭ�������� ������ ����� �� ���� protected �������� ����
	protected String bank;
	protected String id;
	protected String name;
	protected int money;
	
	// ������ : ��ü�� ������ �� ��������� �ʱ�ȭ�ϴ� �޼���
	Account(String bank, String id, String name, int money){
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	
	}
	
	// ���(�޼���(=�Լ�))
	public void deposit(int money) {
		this.money += money;    /// 'this.' ->Account class �� money�� �����ض�
	}
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void info() {
		
		System.out.println("=============");
		System.out.println("�� �� ��: "+bank);
		System.out.println("���¹�ȣ: "+id);
		System.out.println("�� �� ��: "+name);
		System.out.println("�����ܾ�: "+money);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}