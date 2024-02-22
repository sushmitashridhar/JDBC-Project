package com.kodnest.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BankInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("jdbc");

		//loading the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url="jdbc:mysql://localhost/kodnest2";
		String username="root";
		String password="BSRamya@6";

		//Establishing the connection
//		Connection connection = DriverManager.getConnection(url, username, password);
		//			System.out.println(connection +"connection success");

//		Statement stmt = connection.createStatement();
//		String str1="insert into bank values(1,'sandy',674536)";
//		String str2="insert into bank values(2,'sush',112345)";
//		String str3="insert into bank values(3,'brahmi Kanha',098765)";
//		String str4="insert into bank values(4,'sacchi',56789)";
//		String str5="insert into bank values(5,'smi',12328998)";
		
//		String str1="update bank set balance=balance+5000 where acc_no=1";
//		String str2="update bank set balance=balance+5000 where acc_no=2";
//		String str3="update bank set balance=balance+5000 where acc_no=3";
//		String str4="update bank set balance=balance+5000 where acc_no=4";
//		String str5="update bank set balance=balance+5000 where acc_no=5";
		
		
//		669536
//		122345
		String str1="update bank set balance=balance-5000 where acc_no=1";
		String str2="update bank set balance=balance+5000 where acc_no=2";
		
//		stmt.execute(str1);
//		stmt.execute(str2);
//		stmt.execute(str3);
//		stmt.execute(str4);
//		stmt.execute(str5);
		Connection connection=null;
		try {
		//Establishing the connection
				connection = DriverManager.getConnection(url, username, password);
				connection.setAutoCommit(false);
				//creating the statement
				Statement stmt = connection.createStatement();
//			stmt.addBatch(str1);
//				stmt.addBatch(str2);
//				stmt.addBatch(str3);
//				stmt.addBatch(str4);
//				stmt.addBatch(str5);
				
				stmt.addBatch(str1);
				stmt.addBatch(str2);
				stmt.executeBatch();
				connection.commit();
		}catch(Exception e) {
			connection.rollback();
		
		}		
		
		System.out.println("Success");
	}

}


