package test08;

/*
 * 날짜 : 2020/05/13
 * 이름 : 주하림
 * 내용 : 다형성 연습문제
 */

public class JavaTest8 {
	public static void main(String[] args) {
		Television p1 = new Television("가전", 100);
		Computer p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();
	}

}
