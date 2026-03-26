/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.MyServlet to edit this template
 */
package MyServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

String name = request.getParameter("name");
String gender = request.getParameter("gender");
String email = request.getParameter("email");
String address = request.getParameter("address");
String phone = request.getParameter("phone");
String year = request.getParameter("year");
String grade = request.getParameter("grade");

request.setAttribute("name", name);
request.setAttribute("gender", gender);
request.setAttribute("email", email);
request.setAttribute("address", address);
request.setAttribute("phone", phone);
request.setAttribute("year", year);
request.setAttribute("grade", grade);

request.getRequestDispatcher("result.jsp").forward(request, response);
}
}