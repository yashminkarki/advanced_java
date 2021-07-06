package assignment.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertOp {
	
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
				
				PreparedStatement ps = conn.prepareStatement("insert into personalInfo values (?,?,?,?,?)");
				ps.setInt(1, 23);
				ps.setString(2, "Kelly");
				ps.setString(3, "Richard");
				ps.setString(4, "2345 HATHAWAY AVENUE");
				ps.setString(5, "kellyrich@gmail.com");
				
				int i = ps.executeUpdate();
				if(i > 0) {
					System.out.println("Inserted Successfully using Prepared Statement interface");
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
