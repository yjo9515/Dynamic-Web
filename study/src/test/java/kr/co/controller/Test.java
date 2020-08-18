package kr.co.controller;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;

public class Test {
	@Inject
	private DataSource ds;
	@Inject
	private SqlSessionFactory sqlFactory;
	@org.junit.Test
	public void test() throws Exception{ //연결 부분 테스팅
	try(Connection conn = ds.getConnection()){
		System.out.println(conn);
	}catch(Exception e) {
	e.printStackTrace();	
	}
	}
	@org.junit.Test
	public void factoryTest() {		//Mybatis 데이터베이스 바운딩 테스트
		System.out.println(sqlFactory);
	}
	@org.junit.Test
	public void sessionTest() throws Exception{	//sqlSession 로그인 권한 테스팅
		try (SqlSession session = sqlFactory.openSession()){
		System.out.println(session);	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
 }
