package p235;

public class Car {
	//�ʵ�
	String model;
	int speed;
	
	//������
	Car(String model){
		this.model = model;
	}
	
	//�޼ҵ�
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run() {
		for (int i = 10; i <=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+"�� �޸��ϴ�.(�ü� : "+this.speed+"km/h)");
			
		}
	}

	public String getSpeed() {
		// TODO Auto-generated method stub
		return null;
	}

}
