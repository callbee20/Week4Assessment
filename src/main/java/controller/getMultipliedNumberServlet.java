package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MultiplyNumbers;

/**
 * Servlet implementation class getMultipliedNumberServlet
 */
@WebServlet("/getMultipliedNumberServlet")
public class getMultipliedNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMultipliedNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String multNum1 = request.getParameter("multNum1");
		String multNum2 = request.getParameter("multNum2");
		
		int intMultNum1 = Integer.parseInt(multNum1);
		int intMultNum2 = Integer.parseInt(multNum2);
		
		MultiplyNumbers multiplied = new MultiplyNumbers(intMultNum1, intMultNum2);
		
		request.setAttribute("multipliedNumbers", multiplied);
		getServletContext().getRequestDispatcher("/multiplied.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.println(multiplied.toString());
		writer.close();
	}

}
