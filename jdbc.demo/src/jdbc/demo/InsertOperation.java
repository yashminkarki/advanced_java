package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertOperation {
	//insert operation using prepared statement interface

	static String url = "jdbc:mysql://localhost:3306/firstpracticedb";
	static String username = "root";
	static String password = "Nickynick77$";
	static Connection conn = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
			
			if(conn != null) {
				System.out.println("Connected");
				
				PreparedStatement ps = conn.prepareStatement("insert into practiceusers values(?,?,?,?,?)");
				
				ps.setInt(1, 9);
				ps.setString(2, "Peter");
				ps.setString(3, "Griffin");
				ps.setString(4, "New York");
				ps.setString(5, "griffinpete@gmail.com");
				
				int i = ps.executeUpdate();
				
				if(i > 0) {
					System.out.println("Successfully inserted");
				}
				
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("problem in closing connection");
			}
		}

	}

}
