//package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html;charset=UTF-8");

        // Read form fields
     
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String year = request.getParameter("year");
        String grade = request.getParameter("grade");
        String confirm = request.getParameter("confirm");

        // Output HTML page
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Form Submission</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>User Details Submitted</h1>");
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>Gender:</strong> " + gender + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
             out.println("<p><strong>Address:</strong> " + address+ "</p>");
              out.println("<p><strong>Phone:</strong> " + phone + "</p>");
               out.println("<p><strong>Year:</strong> " + year + "</p>");
                out.println("<p><strong>Grade:</strong> " + grade + "</p>");
                 out.println("<p><strong>Confirmation:</strong> " + confirm + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Handles form submission and displays results";
    }
}