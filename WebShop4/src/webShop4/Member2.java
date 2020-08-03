package webShop4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// doGet() �޼ҵ忡�� MemberDAO�� ���� �����ͺ��̸� �����ϰ� �����Ͽ� MemberVO�� ����� ������ �ҷ��� ����ϱ�
/**
 * Servlet implementation class Member
 */
@WebServlet("/Member")
public class Member2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Member2() {
       System.out.println("member �˻��� ��û�Ǿ����ϴ�.");
    }



	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MemberDAO2 dao = new MemberDAO2(); //DAO��ü����
		List list = dao.listMembers(); //DAO��ü�� listMembers()�޼ҵ� ȣ��
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
		out.print("<html><head><title>ȸ�����̺�</title></head><body>");
		out.print("<table border='1'>");
		out.print("<caption>ȸ�����</caption>");
		out.print("<thead><tr><th>���̵�</th><th>��й�ȣ</th><th>�̸�</th><th>�̸���</th><th>������</th></tr></thead>");
		out.print("<tbody>");
		for(int i=0; i<list.size(); i++) {
			MemberVO vo = (MemberVO) list.get(i);
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			Date joinDate = vo.getJoinDate();
			out.print("<tr>");
			out.print("<td>"+id+"</td>");
			out.print("<td>"+pwd+"</td>");
			out.print("<td>"+name+"</td>");
			out.print("<td>"+email+"</td>");
			out.print("<td>"+joinDate+"</td>");
			out.print("</tr>");
		}
		out.print("</tbody></table></body></html>");
		
	
	}

}
