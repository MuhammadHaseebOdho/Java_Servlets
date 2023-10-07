package forms;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Main
 */
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter printWriter=response.getWriter();
		
		printWriter.write("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Document</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <center>\r\n"
				+ "        <form action=\"StudentDetails\" >\r\n"
				+ "    <table >\r\n"
				+ "        <tr>\r\n"
				+ "            <td colspan=\"2\">\r\n"
				+ "                <center>\r\n"
				+ "                <h1 >Fill The Form</h1></center\r\n"
				+ "            </td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Name</td>\r\n"
				+ "            <td><input type=\"text\" name=\"name\"></td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Email</td>\r\n"
				+ "            <td><input type=\"text\" name=\"email\" ></td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>RollNumber</td>\r\n"
				+ "            <td><input type=\"text\" name=\"RollNumber\" ></td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Age</td>\r\n"
				+ "            <td><input type=\"number\" name=\"Age\"></td>\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td>Department</td>\r\n"
				+ "            <td>\r\n"
				+ "                <select name=\"Department\" >\r\n"
				+ "                    <option value=\"Computer Systems\">Computer Systems</option>\r\n"
				+ "                    <option value=\"Software\">Software</option>\r\n"
				+ "                    <option value=\"Civil\">Civil</option>\r\n"
				+ "                </select>\r\n"
				+ "            </td>\r\n"
				+ "\r\n"
				+ "        </tr>\r\n"
				+ "        <tr>\r\n"
				+ "            <td></td>\r\n"
				+ "            <td><button type=\"submit\">Submit</button></td>\r\n"
				+ "        </tr>\r\n"
				+ "    </table>\r\n"
				+ "</form>\r\n"
				+ "</center>\r\n"
				+ "</body>\r\n"
				+ "</html>");

		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
