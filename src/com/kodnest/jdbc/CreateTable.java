package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("jdbc");
		
		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost/kodnest2";
		String username="root";
		String password="BSRamya@6";
		
		//Establishing the connection
		Connection connection = DriverManager.getConnection(url, username, password);
//		System.out.println(connection +"connection success");
		
		Statement stmt = connection.createStatement();
		stmt.execute("create table student(id int,name varchar(20))");
		System.out.println("Success");
	}

}
