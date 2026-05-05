package Rishabh;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/include_1")
public class include_1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		request.setAttribute("msg", "Hii This Full Stack Java Developer");
		RequestDispatcher rd=request.getRequestDispatcher("/include_2");
		
		pw.println("<h1>This is first servlet</h1>");
		System.out.println("This is include mechanism");
		
		rd.include(request, response);
		
		
		
	}

	

}
