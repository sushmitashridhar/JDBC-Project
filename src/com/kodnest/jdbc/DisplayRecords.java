//package com.kodnest.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DisplayRecords {
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		System.out.println("jdbc");
//
//		//loading the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
//
//		String url="jdbc:mysql://localhost/kodnest2";
//		String username="root";
//		String password="BSRamya@6";
//
//		//Establishing the connection
//		Connection connection = DriverManager.getConnection(url, username, password);
//		//						System.out.println(connection +"connection success");
//		//creating the statement
//		Statement stmt = connection.createStatement();
//		//executing the sql statements
//		String str="select * from student where id<3";
//		ResultSet rs = stmt.executeQuery(str);
//		while(rs.next()) {
//		System.out.println(rs.getInt(1) +" "+rs.getString(2));
////		System.out.println(rs.getInt(1));
////		System.out.println(rs.getString(2));
//		}
//		
//	}
//
//}
//
//
//
//
//
//
//
