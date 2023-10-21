package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = java.sql.DriverManager.getConnection("jdbc:mysql://root@localhost/family");
			Statement statement=	connection.createStatement();
		ResultSet  result=statement.executeQuery("SELECT * FROM life");
		
		
		while (result.next()) {
			
			System.out.println("age: "+result.getString(1) +"                       Name: "+result.getString(2));
			System.out.println("job: "+result.getString(3)+"                dep: "+result.getString(4));
			System.out.println("sex: "+result.getString(5)+"                    salary: "+result.getString(6));
			System.out.println("--------------------------------------------  ------");
		}

	}

}
