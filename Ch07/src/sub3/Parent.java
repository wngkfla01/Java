package sub3;

public class Parent extends GrandParent {
	
	
	@Override
	public final void method1() {
		System.out.println("Parent - method1...");
	} 
	
	// Overloading
	public void method2(int a) {
		System.out.println("Parent - method2...");
	}
	
	//Overloading
	public void method3() {
		System.out.println("Parent - method3...");
	}

	
}
