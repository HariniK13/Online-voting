/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin 1
 */
public class home extends HttpServlet {
    
     protected void processRequest(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
                 }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
            res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        String user = req.getParameter("username");
        out.println("hi....");
//         try {
//             
//        out.println("<!DOCTYPE html><html><head><title>home</title>");
//        out.println("</head><body> <div><center><h1>Online Voting System</h1><h3>A project by MCA team</h3></center></div><div><center>");
//        out.println("<ul style =\"list-style:none;\">");
//        out.println("<li>Welcome"+user+" ");
//	out.println("<li><a href=\"home.html\">Home</a></li><li><a href=\"vote.html\">Vote Here</a></li><li><a href=\"vote-stats.jsp\">Voting Statistics</a></li><li><a href=\"JasonServlet\">About Us</a></li>");
//	out.println("<li><a href=\"index.html\">Logout</a></li></ul></center></div></body></html>");
//        
//         } catch (Exception e) {
//             out.println(e);
//         }

        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
