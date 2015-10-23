package forms_exercises;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

/**
 * Servlet implementation class SimpleForm
 */
@WebServlet("/processGetPost")
public class processGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		

		
		out.println("<!DOCTYPE html><html><head><meta charset=\"ISO-8859-1\"><title>Form Submitted!</title></head>");
		out.println("<body bgcolor=\"#FFFFFF\">");
		out.println("<h1 align=\"center\">Signup Form Completed!</h1>");
//		out.println("<body bgcolor=\"#FF0000\">");
		
		out.println("<p>Hey "+ firstName + " " + lastName + "! Thanks for getting in touch! </p>");
//		out.println("<p>Your date of birth is "+ day + " " + monthText + " "  + year + "! </p>");
//		out.println("<p>Your email is "+ email + " </p>");
		out.println("</body>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
