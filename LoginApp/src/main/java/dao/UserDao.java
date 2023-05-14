package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.UserDto;
import utils.DatabseUtils;

public class UserDao {
	public UserDto checkLogin(String username, String password) throws SQLException {
		Connection connection = DatabseUtils.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from user where username = ? and password = ?");
		statement.setString(1, username);
		statement.setString(2, password);
		ResultSet resultSet = statement.executeQuery();
		while(resultSet.next()) {
			Long id = resultSet.getLong(1);
			String name = resultSet.getString(2);
			String pass = resultSet.getString(3);
			UserDto user = new UserDto(id, name, pass);
			return user;
		}
		return null;
	}
}
