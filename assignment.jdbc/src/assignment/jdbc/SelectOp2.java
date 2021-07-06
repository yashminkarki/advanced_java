package assignment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOp2 {
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
				
				Statement st = conn.createStatement();
				String sql = "select * from personalInfo";
				
				ResultSet rs = st.executeQuery(sql);
				System.out.println("id" +  " " + " name" + " " +  " fname" + "  " +  "   address" + "      " +  "      email");
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "  "+ rs.getString(2) + "  "+ rs.getString(3) + "  "+  rs.getString(4) + "  "+  rs.getString(5));
					System.out.print("\n");
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
