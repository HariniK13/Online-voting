/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin 1
 */
public class Login extends HttpServlet {


   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/votingdatabase";
            Connection con=DriverManager.getConnection(url,"root","Shabittaj_786");
            Statement st=con.createStatement();
            ResultSet rs= st.executeQuery("select * from studentdata where username='"+username+"' and password='"+password+"'");
            if(rs.next()){
                response.sendRedirect("home.html");
            }
            else{
                out.println("invalid username or password");
                
            }
        } catch (Exception e) {
            out.println(e);
        }

    }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
