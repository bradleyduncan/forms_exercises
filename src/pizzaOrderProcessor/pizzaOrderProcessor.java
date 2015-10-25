package pizzaOrderProcessor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pizzaOrderProcessor
 */
@WebServlet("/pizzaOrderProcessor")
public class pizzaOrderProcessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pizzaOrderProcessor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String pizzaType = request.getParameter("pizzaType");
		String pizzaSize = request.getParameter("pizzaSize");
		String pizzaBase = request.getParameter("pizzaBase");
		String toppings = request.getParameter("toppings");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String phoneNumber = request.getParameter("phoneNumber");
		
//		Output the order to the customer for validation
		out.println("<!DOCTYPE html><html><head><meta charset=\"ISO-8859-1\"><title>Pizza Order Confirmation</title></head>");
		out.println("<body>");
		out.println("<h1>Pizza Order Confirmation</h1>");
		out.println("<style>table, th, td {border: 1px solid black;</style>");
		out.println("<table><tr><td>Pizza Type</td><td>" + pizzaType + "</td></tr><tr><td>Pizza Size</td><td>" + pizzaSize + "</td></tr><tr><td>Base</td><td>" + pizzaBase + "</td></tr><tr><td>Toppings</td><td>" + toppings + "</td></tr><tr><td>First Name</td><td>" + firstName + "</td></tr><tr><td>Last Name</td><td>" + lastName + "</td></tr><tr><td>Contact Number</td><td>" + phoneNumber + "</td></tr></table>");
		out.println("</body>");
		out.println("</html>");
		
		
//		Print to the terminal the variables submitted by the user
		System.out.println(pizzaType + ", " + pizzaSize + ", " + pizzaBase + ", " +  toppings + ", " +  firstName + ", " + lastName + ", " + phoneNumber);
		
		
	}

}
