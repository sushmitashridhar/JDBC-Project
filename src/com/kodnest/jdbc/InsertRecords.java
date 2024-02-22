package com.kodnest.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			System.out.println("jdbc");
			
			//loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost/kodnest2";
			String username="root";
			String password="BSRamya@6";
			
			//Establishing the connection
			Connection connection = DriverManager.getConnection(url, username, password);
//			System.out.println(connection +"connection success");
			//creating the statement
			String sql="insert into student values(?,?)";
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the ID");
			int id=scan.nextInt();
			scan.nextLine();
			
			System.out.println("Enter the name");
			String name=scan.nextLine();
			
			
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.setString(2,name);
			
			int executeUpdate=statement.executeUpdate();
			System.out.println(executeUpdate+" sucess");
			
			
			
			//executing the sql statements
//			String str="insert into student values(1,'Kanha')";
//			stmt.execute(str);
//			System.out.println("sucess");
		}

	}


