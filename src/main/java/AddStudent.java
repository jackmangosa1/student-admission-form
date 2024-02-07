

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class AddStudent
 */
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Retrieve student information from the form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        String course = request.getParameter("course");

        // Set the response content type
        response.setContentType("text/html");

        // Create a PrintWriter to send the response back to the client
        PrintWriter out = response.getWriter();

        // Generate the HTML response
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Admission Preview</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Student Admission Preview</h2>");
        out.println("<p><strong>First Name:</strong> " + firstName + "</p>");
        out.println("<p><strong>Last Name:</strong> " + lastName + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Course:</strong> " + course + "</p>");
        out.println("</body>");
        out.println("</html>");
	}

}
