package com.kodnest.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecords {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				System.out.println("jdbc");
				
				//loading the Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url="jdbc:mysql://localhost/kodnest2";
				String username="root";
				String password="BSRamya@6";
				
				//Establishing the connection
//				Connection connection = DriverManager.getConnection(url, username, password);
//				System.out.println(connection +"connection success");
				//creating the statement
//				Statement stmt = connection.createStatement();
				//executing the sql statements
//				String str="update student set name='Brahmi Kanha' where id=5";
//				int executeUpdate = stmt.executeUpdate(str);
//				boolean execute = stmt.execute(str);
//				System.out.println("sucess-"+executeUpdate);
				String sql="update student set name=? where id=?";
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the name to be updated");
				String newname=scan.nextLine();
				System.out.println("Enter the ID value where the "+" name needs to be updated" );
				int newid=scan.nextInt();
				//Establishing the connection
				Connection connection = DriverManager.getConnection(url, username, password);
				//creating the statement
				PreparedStatement pt = connection.prepareStatement(sql);
				pt.setInt(2, newid);
				pt.setString(1, newname);
				
				
				int executeUpdate=pt.executeUpdate();
				System.out.println(executeUpdate+" sucess");
			}

		}


