package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.invalidate();
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(request.getContextPath());
		dispatcher.forward(request, response);
		
	}

}
