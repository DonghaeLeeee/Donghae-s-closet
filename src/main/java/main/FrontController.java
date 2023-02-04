package main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;

@WebServlet(urlPatterns = {"*.hrd"})
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		RequestControllerMapping.init();
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = request.getServletPath();
		String method = request.getMethod();
		
		RequestKeyValue key = new RequestKeyValue(url,method);
		
		Controller controller = RequestControllerMapping.getController(key);
		if(controller != null) controller.handle(request, response);
	}
}
