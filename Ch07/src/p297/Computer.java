package p297;

import p296.Calculator;

public class Computer extends Calculator{
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI *r * r;
	}
}
