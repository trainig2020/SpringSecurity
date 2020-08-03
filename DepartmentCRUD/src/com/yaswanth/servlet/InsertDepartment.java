package com.yaswanth.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yaswanth.connection.DaoConnection;

/**
 * Servlet implementation class InsertDepartment
 */
@WebServlet("/createdepartment")
public class InsertDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con;
		PreparedStatement pst;
		if(request.getParameter("deptid") != null) {
	    	 con=DaoConnection.getConnection();
	    	 String cmd="insert into department values(?,?,?,?)";
	    	 int deptno=Integer.parseInt(request.getParameter("deptid"));
	    	 String  name=request.getParameter("dname");
	    	 String head=request.getParameter("head");
	    	 try {
				pst=con.prepareStatement(cmd);
				pst.setInt(1,deptno);
		    	pst.setString(2, name);
		    	pst.setString(4, head);
		    	pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	    	 
	    	
	     }
	}

}
