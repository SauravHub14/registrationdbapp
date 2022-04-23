package com.registration_db_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration_db_app.model.DAO;
import com.registration_db_app.model.DAOImpl;


@WebServlet("/newAccount")
public class CreateNewAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CreateNewAccountController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/create_new_account.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAO dao=new DAOImpl();
		dao.connectDB();
		
		dao.createNewAccount(email,password);
		
		request.setAttribute("newAccountCreated","New Account is created.Please login ");
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.include(request, response);
	}

}
