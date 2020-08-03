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


// doGet() 메소드에서 MemberDAO를 통해 데이터베이를 연결하고 실행하여 MemberVO에 저장된 내용을 불러다 출력하기
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
       System.out.println("member 검색이 요청되었습니다.");
    }



	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MemberDAO2 dao = new MemberDAO2(); //DAO객체생성
		List list = dao.listMembers(); //DAO객체의 listMembers()메소드 호출
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		
		out.print("<html><head><title>회원테이블</title></head><body>");
		out.print("<table border='1'>");
		out.print("<caption>회원목록</caption>");
		out.print("<thead><tr><th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>가입일</th></tr></thead>");
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
