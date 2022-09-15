package com.test.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {

	public static void main(String[] args) {
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root" ,"root");
			System.out.println("Connection success");
		Statement statement=connection.createStatement();
		ResultSet s=statement.executeQuery("SELECT * FROM mydb.user");
		while(s.next())
		{
		System.out.println(s.getInt(1)+" "+s.getString(2)+"  "+s.getString(3)+"  "+s.getString(4)+"  "+s.getString(5));
			
		}
		
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
