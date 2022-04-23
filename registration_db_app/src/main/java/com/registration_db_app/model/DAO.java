package com.registration_db_app.model;

import java.sql.ResultSet;

public interface DAO {
	public void connectDB();

	public boolean verifyCredentials(String email, String password);

	public void saveReg(String name, String city, String email, String mobile);

	public ResultSet listAllreg();

	public void deleteReg(String email);

	public void updateReg(String email, String mobile);

	public void createNewAccount(String email, String password);

	



	

}
