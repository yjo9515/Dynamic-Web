package webShop2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void init() throws ServletException {
		
		System.out.println("��û�۾��� ���� �ʱ�ȭ �۾��� ����Ǿ����ϴ�.");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		System.out.println("GET���� ��û�۾��� ����˴ϴ�.");
	}
	public void destroy() {
		
		System.out.println("����������˴ϴ�.");
	}
}
