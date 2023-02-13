package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vo = request.getParameter("vo");
		request.setAttribute("vo",vo);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("musinsa/updateView.jsp");
		dispatcher.forward(request, response);
	}

}
