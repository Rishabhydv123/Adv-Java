package Rishabh;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(
	    urlPatterns = "/Demo",
	    initParams = {
	        @WebInitParam(name = "username", value = "Rishabh Yadav"),
	        @WebInitParam(name = "Developer", value = "Java developer")
	    }
	)

	public class Demo extends HttpServlet {

	    // Servlet configuration
	    public void init(ServletConfig config) throws ServletException {
	        super.init(config);

	        ServletConfig sc = getServletConfig();
	        
	        String username = sc.getInitParameter("username");
	        String developer = sc.getInitParameter("Developer");

	        System.out.println("username : " + username);
	        System.out.println("Developer : " + developer);
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html");

	        PrintWriter pw = response.getWriter();

	        // Servlet config access
	        pw.println("<h1>Servlet config run successfully</h1><br>");
	        pw.println("<h2>Servlet context run successfully</h2>");
	        pw.println("Response sent successfully");
	    }
	}


