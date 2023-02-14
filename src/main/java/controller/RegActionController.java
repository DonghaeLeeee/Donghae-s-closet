package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MusinsaDao;
import dao.MusinsaMsDao;
import vo.MusinsaMsVo;
import vo.MusinsaVo;

public class RegActionController implements Controller {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MusinsaDao dao = MusinsaDao.getInstance();
		int memberno = Integer.parseInt(request.getParameter("memberno"));
		
		MusinsaMsVo vo2 = new MusinsaMsVo(request.getParameter("id"),request.getParameter("password"));
		
		MusinsaVo vo = new MusinsaVo(memberno,
				request.getParameter("name"),
				request.getParameter("nickname"),
				request.getParameter("phone"),
				request.getParameter("address"),
				null,
				request.getParameter("id"),
				request.getParameter("password"),
				1
				);
		
		
		int result = 0;
		int result2 = 0;
		
		try {
			result = dao.insert(vo);
			result2 = dao.insertMs(vo2);
		} catch (SQLException e) {
		}
		
		
		
		
		String url="location.href='index.jsp'";
	    
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<script>");
		if(result ==1 && result2 ==1) {
			out.print("alert('회원 등록 성공');");
		} else {
			out.print("alert('회원 등록 실패');");
		}
		out.print(url);
		out.print("</script>");
		
	}

}
