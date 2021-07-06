package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation2 {
	
	//insert operation using Statement interface
	
	static String url = "jdbc:mysql://localhost:3306/firstpracticedb";
	static String username = "root";
	static String password = "Nickynick77$";
	static Connection conn = null;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
			
			if (conn != null) {
				System.out.println("Connected");
				Statement st = conn.createStatement();
				String sql = "insert into practiceusers values(10,'Maggie','G','Kansas','maggie.g@yahoo.com')";
				
				int i = st.executeUpdate(sql);
				
				if (i > 0) {
					System.out.println("Successfully inserted");
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Problem in closing the connection");
			}
		}

	}

}
