package webShop4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO3 {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "scott";
	private static final String pwd = "tiger";
	
	private Connection con;
	private PreparedStatement pstmt;
	
	public List listMembers() {
		
		List list = new ArrayList();
		try {
			connDB();
			String query = "insert into member (id,pwd,name,email,joinDate) values ('yko8411','1234','ho', 'yjo3202@naver.com', sysdate) ";
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
	private void connDB() {
		try{
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("연결자 생성 성공");
			
		}catch(Exception e){
			System.out.println("데이터베이스 연결 실패");
		}
		
		}

		
		
		
	}
