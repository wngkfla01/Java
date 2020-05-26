package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2020/05/26
 * �̸� : ���ϸ�
 * ���� : JDBC Update �ǽ��ϱ�
 */

public class UpdateTest {
	public static void main(String[] args) {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/jhr";
		String user = "jhr";
		String pass = "1234";
		Connection conn = null;
		
		try {
			// 1�ܰ� - JDBC ����̹� �ε� 
			Class.forName("com.mysql.jdbc.Driver");
		
			// 2�ܰ� - �����ͺ��̽� ����
			conn = DriverManager.getConnection(host, user, pass);
			
			// 3�ܰ� - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
			
			// 4�ܰ� - SQL ����
			String sql  = "UPDATE `USER1` SET `hp` = '010-1111-1111' ";
				   sql += "WHERE `uid`='j101'";
			stmt.executeUpdate(sql);
			
			// 5�ܰ� - ����� ó��(SELECT�� ���)
			// 6�ܰ� - �����ͺ��̽� ����
			conn.close();
		} catch (Exception e) {
			System.out.println("������ ���࿡ ������ �߻��߽��ϴ�.");
		}
		System.out.println("UPDATE �Ϸ�!!!");
		
		
		
	}

}
