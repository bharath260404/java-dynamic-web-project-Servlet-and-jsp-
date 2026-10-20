

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Control in the first servlet");
	
    RequestDispatcher reqDispatch= request.getRequestDispatcher("/SecondServlet");
    
    reqDispatch.forward(request, response);
    
   PrintWriter writer = response.getWriter();
   writer.println("<h1> Response from servlet one</h1>");
	writer.close();
	}

}
