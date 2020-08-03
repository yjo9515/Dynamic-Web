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
	private DataSource dataFactory; //DataSource Ŭ�����κ��� ��ü ����
	public MemberDAO2() {
		try {
			Context ctx = new InitialContext(); //���ؽ�Ʈ ���� �ҷ��� ��ü ����
			Context envContext = (Context) ctx.lookup("java/comp/env");	//����̹� ���� �ε�
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle"); //�������� �ε�		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List listMembers() {
		
		List list = new ArrayList();
		try {
			con = dataFactory.getConnection(); //���ؽ�Ʈ�� ���� ����
			String query = "select * from member";
			System.out.println("������ �˻� ���� : "+query );
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
			System.out.println("������ �˻��� �����Ͽ����ϴ�.");
			e.printStackTrace();
		}
		return list;
			
		}

		
		

		
		
		
	}
