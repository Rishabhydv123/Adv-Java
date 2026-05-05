package Rishabh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class forward_2
 */
@WebServlet("/forward_2")
public class forward_2 extends HttpServlet {
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		System.out.println("Forword mechanism Excuted");
		
		pw.println("<h1>Forword mechanism has been excuted </h1>");
		pw.println("<h2>this is second servlet</h2>");
		
	}

}
