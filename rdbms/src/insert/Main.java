package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test01","root","");
		
		PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?)");
		
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, "Parinita");
		preparedStatement.executeUpdate();
		
		System.out.println("inserted");
		
		connection.close();
		
	}
}