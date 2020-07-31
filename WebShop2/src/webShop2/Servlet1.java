package webShop2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void init() throws ServletException {
		
		System.out.println("요청작업에 대한 초기화 작업이 진행되었습니다.");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		System.out.println("GET으로 요청작업이 진행됩니다.");
	}
	public void destroy() {
		
		System.out.println("연결이종료됩니다.");
	}
}
