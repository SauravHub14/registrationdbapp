package com.registration_db_app.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registration_db_app.model.DAO;
import com.registration_db_app.model.DAOImpl;


@WebServlet("/listAll")
public class ListAllRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ListAllRegistrationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
		
		if(session.getAttribute("email")!=null) {
		
		
		DAO dao=new DAOImpl();
		dao.connectDB();
		
		
		ResultSet result=dao.listAllreg();
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/result.jsp");
		rd.forward(request, response);
		}else {
			request.setAttribute("logOutMsg","Please login again!You have logged out");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
