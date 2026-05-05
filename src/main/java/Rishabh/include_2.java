package Rishabh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/include_2")
public class include_2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String message=(String) request.getAttribute("msg");
		
		pw.println("<h1> This second servlet</h2>" +"<br>");
		pw.println("Message acces :" +message);
		System.out.println("message on console :" +request.getAttribute("msg"));
		
		pw.println("Include mechanism has been execute succusfully");

		
	}

}
