package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperation {
	//update operation using prepared statement interface

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
				
				PreparedStatement ps = conn.prepareStatement("update practiceusers set first_name=?, last_name=? where email=?");
				
				ps.setString(1, "Meg");
				ps.setString(2, "P");
				ps.setString(3, "maggie.g@yahoo.com");
				
				int i = ps.executeUpdate();
				if(i > 0) {
					System.out.println("successfully updated");
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
				e.printStackTrace();
			}
		}
		

	}

}
