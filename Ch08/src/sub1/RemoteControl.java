package sub1;

public interface RemoteControl {
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	// abstract 생략가능
	public abstract void chUp();
	public abstract void chDown();
	
	public abstract void soundUp();
	public abstract void soundDown();
}