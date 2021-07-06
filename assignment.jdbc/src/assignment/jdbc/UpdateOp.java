package assignment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOp {
	static String url = "jdbc:mysql://localhost:3306/sampletb";
	static String username = "root";
	static String password = "Nickynick77$";
	static Connection conn = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, username, password);
			
			if(conn != null) {
				System.out.println("Connected");
				
				PreparedStatement ps = conn.prepareStatement("update personalInfo set name=?, fname=?, email=? where id=?");
				ps.setString(1, "Paris");
				ps.setString(2, "Keith");
				ps.setString(3, "parisk@gmail.com");
				ps.setInt(4, 23);
				
				int i = ps.executeUpdate();
				if(i > 0) {
					System.out.println("Updated Successfully using Prepared Statement interface");
				}
			}
		}catch(Exception e) {
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
