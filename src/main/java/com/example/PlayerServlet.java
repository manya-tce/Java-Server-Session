package io.datajek.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/user.do")
public class PlayerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String userName = request.getParameter("name");
		String userJob = request.getParameter("job");
		System.out.println(userName);
		System.out.println(userJob);
		request.setAttribute("name", userName);
		request.setAttribute("job", userJob);
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
}
