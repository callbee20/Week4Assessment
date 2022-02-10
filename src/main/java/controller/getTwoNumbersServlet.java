package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddNumbers;

/**
 * Servlet implementation class getTwoNumbersServlet
 */
@WebServlet("/getTwoNumbersServlet")
public class getTwoNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTwoNumbersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userNumber1 = request.getParameter("userNumber1");
		String userNumber2 = request.getParameter("userNumber2");
		
		int intNum1 = Integer.parseInt(userNumber1);
		int intNum2 = Integer.parseInt(userNumber2);
		
		AddNumbers added = new AddNumbers(intNum1, intNum2);
		
		request.setAttribute("addedNumbers", added);
		getServletContext().getRequestDispatcher("/finisher.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(added.toString());
		writer.close();
	}

}
