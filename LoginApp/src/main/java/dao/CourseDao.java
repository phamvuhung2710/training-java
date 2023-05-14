package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CourseDto;
import utils.DatabseUtils;

public class CourseDao {
	public List<CourseDto> listCourse() throws SQLException {
		Connection connection = DatabseUtils.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from course");
		ResultSet resultSet = statement.executeQuery();
		List<CourseDto> listCourse = new ArrayList<>();
		while(resultSet.next()) {
			Long courseId = resultSet.getLong(1);
			Long subjectId = resultSet.getLong(2);
			String courseCode = resultSet.getString(3);
			String title = resultSet.getString(4);
			String numberOfCredits = resultSet.getString(5);

			CourseDto courseDto = new CourseDto(courseId, subjectId, courseCode, title, numberOfCredits);
			listCourse.add(courseDto);
		}
		return listCourse;
	}
}
