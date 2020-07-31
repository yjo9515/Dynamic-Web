package webShop2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("두 번째 요청이 처리됩니다.");
	}

	@Override
	public void destroy() {
		System.out.println("두 번째 요청이 모두 처리되어 종료합니다.");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("두 번째 요청이 시작되었습니다.");
	}

}
