package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MusinsaDao;
import vo.MusinsaVo;

public class LoginActionController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MusinsaDao dao = MusinsaDao.getInstance();
		HttpSession session = request.getSession();

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		try {
			if (id != null && password != null) {
				dao.login(id, password);
				session.setAttribute("userid", id);
				response.sendRedirect(request.getContextPath());
			}else {
				response.sendRedirect("/musinsa/loginView.jsp");
			}
		} catch (SQLException e) {
		}

	}

}
