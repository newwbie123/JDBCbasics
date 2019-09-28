package jdbcInsertUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingTheRow {
	
	public static void deletingRow() {
		
		String url = "jdbc:mysql://localhost:3306/employees_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		try {

			// establish connection - Object
			Connection conn = DriverManager.getConnection(url, "root", "Kresimir2018");

			// now to create statement - Object, to send to database
			Statement statement = conn.createStatement();

			// now to execute the statement - insert new input to database

			statement.executeUpdate("delete from employees_tbl where id=800;");

			// and process the result:

			System.out.println("Executed a Delete statement...");

		} catch (SQLException e) {
			
			System.out.println("Error while deletion...");
		}
		
	}

}
