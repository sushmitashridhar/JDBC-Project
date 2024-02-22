package com.kodnest.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecords {

				public static void main(String[] args) throws ClassNotFoundException, SQLException {
					System.out.println("jdbc");
					
					//loading the Driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					String url="jdbc:mysql://localhost/kodnest2";
					String username="root";
					String password="BSRamya@6";
					
					//executing the sql statements
					String sql="delete from student where id=?";
					
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter the ID value where the "+" name needs to be deleted" );
					int id=scan.nextInt();
					
					//Establishing the connection
					Connection connection = DriverManager.getConnection(url, username, password);
//					System.out.println(connection +"connection success");
					//creating the statement
//					Statement stmt = connection.createStatement();
					PreparedStatement pt = connection.prepareStatement(sql);
					pt.setInt(1, id);
					int executeUpdate = pt.executeUpdate();
					
				
					//executing the sql statements
//					String str="delete from student where id=1";
					
//					boolean execute = stmt.execute(str);
					System.out.println("sucess-"+executeUpdate);
					
				}

			}





