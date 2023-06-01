package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.insertquery;
import dto.User;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Servlet implementation class UserSecondController
 */
@WebServlet("/UserSecondController")
public class UserSecondController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSecondController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> user=null;
		try {
		 user=insertquery.getAllDetails();
	} catch (Exception e) {
		
		e.printStackTrace(); 
	}
		request.setAttribute("key", user);
	request.getRequestDispatcher("First.jsp").forward(request, response);
	//response.sendRedirect("First.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Name=request.getParameter("Name");
		String FatherName=request.getParameter("FatherName");
		String EmailId=request.getParameter("EmailId");
		String PhoneNo=request.getParameter("PhoneNo");
		String Address=request.getParameter("Address");
		User userobj=new User(Name, FatherName, EmailId, PhoneNo, Address);
		
		try {
			insertquery.saveuser(userobj);
	        doGet(request, response);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("data insert the table");
	}

}
