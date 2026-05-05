//package Rishabh;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebFilter("/*")
//public class filter_login implements Filter {
//
//    @Override
//    public void init(FilterConfig config) {
//        System.out.println("Filter Initialization");
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
//
//        System.out.println("before started servlet");
//
//        res.setContentType("text/html");
//        PrintWriter pw = res.getWriter();
//
//        String name = req.getParameter("name");
//  
//        if (name != null && name.equals("admin")) {
//            chain.doFilter(req, res);
//        } else {
//            pw.println("User are not able to read any information from the server (Access Denied)");
//        }
//
//        System.out.println("After started servlet");
//
//        pw.println("<h1>Filter config Execute successfully </h1>");
//        pw.println("filter allows those user which user registered");
//        pw.println("servlet execute finally");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("Filter destroyed");
//    }
//}