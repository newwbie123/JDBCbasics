package jdbcInsertUpdateDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/employees_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		try {

			// establish connection - Object
			Connection conn = DriverManager.getConnection(url, "root", "Kresimir2018");

			// now to create statement - Object, to send to database
			Statement statement = conn.createStatement();

			// now to execute the statement - insert new input to database

			statement.executeUpdate("insert into employees_tbl(id, name, dept, salary) values (800, 'Juliet', 'Sales', 5500);");

			// and process the result:

			System.out.println("Executed an Insert statement...");

		} catch (SQLException e) {
			System.out.println("Error while insertion");
		}
		
		
		// command to delete the row, defined in class DeletingTheRow
		
		// DeletingTheRow.deletingRow();

	}

}
