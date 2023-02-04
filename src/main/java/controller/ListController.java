package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusinsaDao;
import vo.MusinsaVo;

public class ListController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MusinsaVo> list = null;

		MusinsaDao dao = MusinsaDao.getInstance();

		try {
			list = dao.selectlist();

		} catch (SQLException e) {
		}

		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("musinsa/listView.jsp");
		dispatcher.forward(request, response);

	}
}
