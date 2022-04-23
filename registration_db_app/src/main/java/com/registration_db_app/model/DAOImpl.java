package com.registration_db_app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAOImpl implements DAO {
	private Connection con;
	private Statement stmnt;

	
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_reg4","root","Athakur@1996.");
			stmnt=con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}


	@Override
	public boolean verifyCredentials(String email, String password) {
		try {
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"'and password='"+password+"'");
			 return result.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public void saveReg(String name, String city, String email, String mobile) {
		try {
			 stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public ResultSet listAllreg() {
		
		try {
			 ResultSet result = stmnt.executeQuery("select * from registration ");
			 return result;
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}


	@Override
	public void deleteReg(String email) {
		try {
			 stmnt.executeUpdate("Delete from registration where email='"+email+"'");
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void updateReg(String email, String mobile) {
		try {
			 stmnt.executeUpdate("update registration set mobile='"+mobile+"'where email='"+email+"'");
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void createNewAccount(String email, String password) {
		try {
			 stmnt.executeUpdate("insert into login values('"+email+"','"+password+"')");
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


	
	

}
