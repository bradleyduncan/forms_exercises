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
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String pizzaType = request.getParameter("pizzaType");
		String pizzaSize = request.getParameter("pizzaSize");
		String pizzaBase = request.getParameter("pizzaBase");
		String toppings = request.getParameter("toppings");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String emailAddress = request.getParameter("emailAddress");
		
		System.out.println(pizzaType + pizzaSize + pizzaBase + toppings + firstName + lastName + emailAddress);
		out.println("Test");
		
	}

}
