package Rishabh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/cookies_session")

public class cookies_session extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("<html><body>");
        pw.println("<form method='post'>");
        pw.println("Name : <input type='text' name='name'>");
        pw.println("<button type='submit' value='submit'>Submit</button>");
        pw.println("</form>");

        // read cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie ck : cookies) {
                if ("user".equals(ck.getName())) {
                    pw.println("<h1> Cookies value :" + ck.getValue() + "<br>");
                }
            }
        }

        // session
        System.out.println("session executed ");
        HttpSession session = request.getSession();

        if (session != null) {
            pw.println("Session value:" + session.getAttribute("usersession"));
        }

        pw.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        // TODO Auto-generated method stub
        doGet(request, response);

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        String name = request.getParameter("name");

        // cookies
        Cookie c = new Cookie("user", name);
        response.addCookie(c);

        // session
        HttpSession s = request.getSession();
        s.setAttribute("usersession", name);

        pw.println("<html><body>");
        pw.println("<h1>Welcome " + name + "</h1>");
        pw.println("Session and cookies execute successfully");
        System.out.println("Session and cookies executed");

        pw.println("<a href='cookies_session'>Go Back</a>");
        pw.println("</body></html>");
    }
}