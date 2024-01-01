/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin 1
 */
public class Register extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html");
                PrintWriter out=response.getWriter();
                String btn=request.getParameter("Register");
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/votingdatabase";
                        Connection con=DriverManager.getConnection(url,"root","Shabittaj_786");

                        if(btn.equals("Register")){

                            String fname= request.getParameter("fname");
                            String lname= request.getParameter("lname");
                            String uname=request.getParameter("uname");
                            String regpwd=request.getParameter("regpwd");
                            Statement st=con.createStatement();
                            st.executeUpdate("insert into studentdata values('"+fname+"','"+lname+"','"+uname+"','"+regpwd+"')");
                            //request.setAttribute("msg","registered successfully..");
                            //out.println("<script type=\"text/javascript\">alert('registered successfully..)</script>");
                            String address="./index.html";

                            RequestDispatcher dis=request.getRequestDispatcher(address);
                            dis.forward(request,response);
                        }
        } catch (Exception e) {
            out.println(e);
            
        }
			     
        }
                
    
                             
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
