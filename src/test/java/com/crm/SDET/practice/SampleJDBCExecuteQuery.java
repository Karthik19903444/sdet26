package com.crm.SDET.practice;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {

public static void main(String[] args)throws SQLException {

	//Step 1 register to database
	Driver driverRef = new Driver();
	DriverManager.registerDriver(driverRef);
}
}

   //Step 2: get connection from 