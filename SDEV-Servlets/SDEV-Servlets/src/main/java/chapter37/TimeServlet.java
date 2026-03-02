package chapter37;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.time.LocalTime;

public class TimeServlet extends HttpServlet {

    // Called by the servlet engine to initialize servlet
    public void init() throws ServletException {
        // Initialization code if needed
    }

    // Handle GET request
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type to HTML
        response.setContentType("text/html");

        // Create output writer
        PrintWriter out = response.getWriter();

        // Get current time
        LocalTime currentTime = LocalTime.now();

        // Generate HTML response
        out.println("<html>");
        out.println("<head><title>Current Time Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Current Time: " + currentTime + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    // Handle POST request
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response); // For simplicity, POST behaves like GET
    }

    // Called by servlet engine to release resources
    public void destroy() {
        // Cleanup code if needed
    }
}