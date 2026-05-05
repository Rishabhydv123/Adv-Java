package Rishabh;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@import com.sun.tools.javac.util.Context;

@WebServlet(
  urlPatterns = "/context",
  initParams = {
      @WebInitParam(name = "username", value = "Rishabh"),
      @WebInitParam(name = "Developer", value = "full stack java developer")
  }
)

public class context extends HttpServlet {
  /***  */
	private static final long serialVersionUID = 1L;

  // servlet config one time
  public void init(ServletConfig config) throws ServletException {
      super.init(config);
      String username = config.getInitParameter("username");
      String Developer = config.getInitParameter("Developer");
      System.out.println("servlet config data");

      System.out.println("Username: " + username);
      System.out.println("Developer : " + Developer);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

      response.setContentType("text/html");
      PrintWriter pw = response.getWriter();

      // servlet config
      ServletConfig config = getServletConfig();
      String username = config.getInitParameter("username");

      // servlet context
      ServletContext context = getServletContext();
      context.setAttribute("java", "java is a object orianted programming language");
      Object site = context.getAttribute("java");

      pw.println("<h1> servlet config</h1>" + username);
      pw.println("<h2> servlet context</h2>" + site);
      pw.println("Response send succesfully");
  }

	}
                                                 