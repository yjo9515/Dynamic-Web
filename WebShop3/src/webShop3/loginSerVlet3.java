package webShop3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginSerVlet3
 */
@WebServlet("/loginSerVlet3")
public class loginSerVlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginSerVlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res, String id, String pw) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id1 = req.getParameter("id");
		String ps = req.getParameter("ps");
		req.getParameter(id1 );
		req.getParameter(ps);
		
		
	 System.out.println("���̵� : "+id1 );
	 System.out.println("�н����� : "+ps);
	 
	 res.setContentType("text/html;charset=utf-8");
	 PrintWriter out = res.getWriter(); //html �� �ؽ�Ʈ�� �Ǿ��̤ӤӤ��� �����͸� ������ ����ϱ�����
	 
	 if(id1  != null && (id1 .length() != 0)) {
		 if(id1 .contentEquals("admin")) {
			 out.print("<html>");
			 out.print("<body>");
			 out.print("<h2>�����ڷ� �α��� �Ͽ����ϴ�</h2>");
			 out.print("</body>");
			 out.print("</html>");
			 
		 }else {
			 out.print("<html>");
			 out.print("<body>");
			 out.print("<h3>"+id1 +"���� �α��� �Ͽ����ϴ�.");
			 out.print("</body>");
			 out.print("</html>");
		 }
		 
		 
		 
	 }
	 
		
	}

}
