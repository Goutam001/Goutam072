package org.goutam.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
 
public class HelloServlet extends HttpServlet {
    
   private static final long serialVersionUID = 1L;
 
    
   public HelloServlet() {
   }
 
  
   protected void doGet(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {
        
       ServletOutputStream out = response.getOutputStream();
        
       out.println("<html>");
       out.println("<head><title>Hello Servlet</title></head>");
       out.println("<body>");
       out.println("<h3>Hello World</h3>");
       out.println("<h3>Goutam Says Hello</h3>");
       out.println("This is My first Servlet");
       out.println("</body>");
       out.println("<html>");
   }
 
  
   protected void doPost(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {
       this.doGet(request, response);
   }
 
}