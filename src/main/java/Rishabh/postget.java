package Rishabh;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
 
@WebServlet("/postget")
public class postget extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<h1>This is Get Rest api Request </h1>");
        System.out.println("This is get rest api request");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("Post rest api request has been execute successfully");
        System.out.println("This is post request in Rest api");
    }

    public void destroy() {
        System.out.println("This is destroyed method which will destroy");
    }
}
