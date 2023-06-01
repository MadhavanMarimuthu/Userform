package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.dp;
import dto.User;

public class insertquery {

	public static void saveuser(User userobj) throws ClassNotFoundException, SQLException {
		Connection connection = dp.getConnection();
		String insertQuery = "insert into tb_UserForm(Name,FatherName,EmailId,PhoneNo,Address)values(?,?,?,?,?)";

		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, userobj.getName());
		preparedStatement.setString(2, userobj.getFatherName());
		preparedStatement.setString(3, userobj.getEmailId());
		preparedStatement.setString(4, userobj.getPhoneNo());
		preparedStatement.setString(5, userobj.getAddress());
		preparedStatement.executeUpdate();
	}


public static List<User> getAllDetails() throws ClassNotFoundException, SQLException {
	Connection connection = dp.getConnection();
	String SelectQuery = "select * from tb_UserForm";
	PreparedStatement preparedStatement = connection.prepareStatement(SelectQuery);
	ResultSet resultSet = preparedStatement.executeQuery();
	List<User> user=new ArrayList<User>();
	while(resultSet.next()) {
		String Name=resultSet.getString(1);
		String FatherName=resultSet.getString(2);
		String EmailId=resultSet.getString(3);
		String PhoneNo=resultSet.getString(4);
		String Address=resultSet.getString(5);
		User obj=new User(Name,FatherName,EmailId,PhoneNo,Address);
		user.add(obj);
		
	
	}
	return user;
}
}