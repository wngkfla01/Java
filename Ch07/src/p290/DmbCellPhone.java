package p290;

public class DmbCellPhone extends CellPhone{
	//�ʵ�
	public int channel;
	
	//������
	public DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	public void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB ��� ������ �����մϴ�.");
	}
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}

}
