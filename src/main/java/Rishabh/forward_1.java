package Rishabh;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class forward_1
 */
@WebServlet("/forward_1")
public class forward_1 extends HttpServlet {
	
	
//	forward mechanism
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/forward_2");
		
		rd.forward(request, response);
				
	}

}
