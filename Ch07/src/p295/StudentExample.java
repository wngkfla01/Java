package p295;

import p294.Student;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-123456789", 1);
		System.out.println("name: "+student.name);
		System.out.println("ssn: "+student.ssn);
		System.out.println("studentNo: "+student.studentNo);
	}

}
