package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusinsaDao;

public class RegController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MusinsaDao dao = MusinsaDao.getInstance();
		
		try {
			int memberno = 0;
			memberno = dao.plusmemberno();
			request.setAttribute("memberno", memberno);
		} catch (SQLException e) {
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("musinsa/regView.jsp");
		dispatcher.forward(request, response);
	}

}
