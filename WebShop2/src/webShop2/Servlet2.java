package webShop2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("�� ��° ��û�� ó���˴ϴ�.");
	}

	@Override
	public void destroy() {
		System.out.println("�� ��° ��û�� ��� ó���Ǿ� �����մϴ�.");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("�� ��° ��û�� ���۵Ǿ����ϴ�.");
	}

}
