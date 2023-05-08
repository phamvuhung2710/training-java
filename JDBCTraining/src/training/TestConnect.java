package training;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnect {
	public static void main(String[] args) {
		try {
			Connection con = DatabaseUtils.getConnection();
			Statement stm = con.createStatement();

			ResultSet rs = stm.executeQuery("select course_id, title from course");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " - " + rs.getString(2));
			}
			
			// Insert a new record into Course table using PrepareStatement
			PreparedStatement statement = con.prepareStatement("insert into course (course_id, subject_id, course_code, title, number_of_credits) VALUES (?, ?, ?, ?, ?)");
			statement.setInt(1, 3);
			statement.setInt(2, 2);
			statement.setInt(3, 2);
			statement.setString(4, "ReactJS");
			statement.setInt(5, 2);
			
			int rowsInserted = statement.executeUpdate();

			if (rowsInserted > 0) {
			    System.out.println("A new record was inserted successfully!");
			}
		} catch( SQLException e) {
			e.printStackTrace();
		}
	}
}
