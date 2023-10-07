package forms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class StudentDetails
 */
public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String rollNum=request.getParameter("RollNumber");
		String age=request.getParameter("Age");
		String department=request.getParameter("Department");
		
		 printWriter.write("<h1>Student Details</h1>");
		 printWriter.write("<p>Student name: "+name+"</p>");
		 printWriter.write("<p>Student Email: "+email+"</p>");
		 printWriter.write("<p>Student RollNumber: "+rollNum+"</p>");
		 printWriter.write("<p>Student Age: "+age+"</p>");
		 printWriter.write("<p>Student Department: "+department+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
