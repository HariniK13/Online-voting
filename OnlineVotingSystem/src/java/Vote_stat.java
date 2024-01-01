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
public class Vote_stat extends HttpServlet {

   PrintWriter out;
	Connection con;
	Statement st;
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
            try{
			out=res.getWriter();
			Class.forName("com.mysql.cj.jdbc.Driver");
                        String url="jdbc:mysql://localhost:3306/votingdatabase";
                        con=DriverManager.getConnection(url,"root","Shabittaj_786");
			st=con.createStatement();
					
				String query="select * from devlang";
				ResultSet rs=st.executeQuery(query);
				out.println("<html><head><title>Reading All Rows</title></head><body><center><h1><b> RECORDS </b></h1><br><br><table border=10><tr>"+
				"<td><b>USERNAME</b></td><td><b>VOTES</b></td></tr>");
				while(rs.next())
				{
					
					out.print("<td>"+rs.getString("USERNAME")+"</td>");
                                        out.print("<td>"+rs.getString("VOTES")+"</td></tr>");
					
				}
				out.println("</table><a style=\"color:blue;text-decoration:none;\" href=\"home.html\" > Home Page </a></center></body></html>");
				con.close();
				
		}
		catch(Exception e)
		{
			out.println(e);
		}
        }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
