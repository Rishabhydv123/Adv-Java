package Rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/error_code")
public class error_code extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("Username");
        String useragent = request.getHeader("User-Agent");
        String ip = request.getRemoteAddr();
        String method = request.getMethod();

        if (name == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Bad Request");
            return;
        }

        if (!name.equalsIgnoreCase("admin")) {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Only admin allowed");
            return;
        }
        response.setHeader("name","username");

        response.setHeader("Refresh", "5");
        System.out.println("Error code executed");

        pw.println("<h1>Error codes and header executed successfully</h1>");
        pw.println("<h2>Name: " + name + "</h2><br>");
        pw.println("<h2>Browser Agent: " + useragent + "</h2><br>");
        pw.println("<h2>IP Address: " + ip + "</h2><br>");
        pw.println("<h2>Method: " + method + "</h2>");
    }
}