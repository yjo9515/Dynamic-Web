package webShop4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO2 {
	
	private Connection con;
	private PreparedStatement pstmt;
	private DataSource dataFactory; //DataSource 클래스로부터 객체 생성
	public MemberDAO2() {
		try {
			Context ctx = new InitialContext(); //컨텍스트 내용 불러올 객체 생성
			Context envContext = (Context) ctx.lookup("java/comp/env");	//드라이버 정보 로딩
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle"); //연결정보 로딩		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listMembers() {
		
		List list = new ArrayList();
		try {
			con = dataFactory.getConnection(); //컨텍스트에 의한 연결
			String query = "select * from member";
			System.out.println("데이터 검색 문장 : "+query );
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("데이터 검색이 실패하였습니다.");
			e.printStackTrace();
		}
		return list;
			
		}

		
		

		
		
		
	}
