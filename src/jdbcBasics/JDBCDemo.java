package jdbcBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/employees_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		try {
			// establish connection - Object
			Connection conn = DriverManager.getConnection(url, "root", "Kresimir2018");
			
			// now to create statement - Object, to send to database
			Statement statement = conn.createStatement();
			
			// now to execute the statement - Object and make it a Set, in this case ResultSet:
			
			ResultSet resultSet = statement.executeQuery("select * from employees_tbl");
			
			// and process the result:
			int salaryTotal = 0;
			
			while(resultSet.next()) {
				
				salaryTotal = salaryTotal + resultSet.getInt("salary");
				
				//System.out.println(resultSet.getString("name"));
			}
			
			System.out.println(salaryTotal);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


