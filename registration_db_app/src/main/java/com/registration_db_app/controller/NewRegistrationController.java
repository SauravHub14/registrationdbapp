package com.registration_db_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.registration_db_app.model.DAO;
import com.registration_db_app.model.DAOImpl;


@WebServlet("/reg")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public NewRegistrationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
		rd.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
			
			
			session.setMaxInactiveInterval(10);
			if(session.getAttribute("email")!=null) {
			
			
			String name = request.getParameter("name");
			String city = request.getParameter("city");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			
			DAO dao=new DAOImpl();
			dao.connectDB();
			
			dao.saveReg(name,city,email,mobile);
			
			request.setAttribute("message","record is saved!!");
			
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/new_registration.jsp");
			rd.include(request, response);
		
		}else {
			request.setAttribute("error","invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			
		}
			
		} catch (Exception e) {
			request.setAttribute("logOutMsg","Session time out.please login again");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			e.printStackTrace();
		}


}
}
