package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleUtil;
import vo.MusinsaMsVo;
import vo.MusinsaVo;

public class MusinsaDao {

	private static MusinsaDao dao = new MusinsaDao();

	private MusinsaDao() {
	};

	public static MusinsaDao getInstance() {
		return dao;
	}

	// 회원가입할때 정보 기입
	public int insert(MusinsaVo vo) throws SQLException {
		
		String sql = "INSERT INTO MUSINSAPEOPLE values(?,?,?,?,?,sysdate,?,?)";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, vo.getMemberno());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getNickname());
		pstmt.setString(4, vo.getPhone());
		pstmt.setString(5, vo.getAddress());
		pstmt.setString(6, vo.getId());
		pstmt.setString(7, vo.getPassword());

		int result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return result;
	}

	// 회원정보수정
	public int update(MusinsaVo vo) throws SQLException {
		String sql = "UPDATE MUSINSAPEOPLE \r\n" + "SET NICKNAME = ?, PHONE = ?, ADDRESS = ?, password= ?\r\n"
				+ "WHERE memberno = ?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(5, vo.getMemberno());
		pstmt.setString(1, vo.getNickname());
		pstmt.setString(2, vo.getPhone());
		pstmt.setString(3, vo.getAddress());
		pstmt.setString(4, vo.getPassword());

		pstmt.close();
		conn.close();
		return pstmt.executeUpdate();
	}

	// 회원삭제
	public int delete(int memberno) throws SQLException {
		String sql = "DELETE FROM MUSINSAPEOPLE m \r\n" + "WHERE MEMBERno = ?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setInt(1, memberno);

		pstmt.close();
		conn.close();
		return pstmt.executeUpdate();
	}

	// 로그인
	//로그인하면 닉네임 나오게설정
	public void login(String id, String password) throws SQLException {
		String sql = "SELECT id, password, nickname FROM MUSINSAPEOPLE m \r\n" + "WHERE id = ? AND password = ?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setNString(1, id);
		pstmt.setNString(2, password);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			rs.getString(1);
			rs.getString(2);
			rs.getString(3);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
	}
	
	//회원 전체목록 조회
	public List<MusinsaVo> selectlist() throws SQLException {
		List<MusinsaVo> list = new ArrayList<>();
		String sql = "SELECT * FROM MUSINSAPEOPLE order by memberno";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			MusinsaVo m = new MusinsaVo(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getDate(6),
					rs.getString(7),
					rs.getString(8));
			list.add(m);
		}
		rs.close();
		pstmt.close();
		conn.close();
		
		return list;
	}
	
	//회원정보(pk)로 조회하기
	public MusinsaVo selectOne(int memberno) throws SQLException {
		MusinsaVo vo = null;
		String sql = "SELECT * FROM MUSINSAPEOPLE m \r\n"
				+ "WHERE memberno = ?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1,memberno);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next())
			vo = new MusinsaVo(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getDate(6),
					rs.getString(7),
					rs.getString(8));
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return vo;
		}
	
	
	//회원번호 자동증가
	public int plusmemberno() throws SQLException {
		String sql = "SELECT max(memberno)+1 from musinsapeople";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		int result = 0;
		
		if(rs.next())
			result =rs.getInt(1);
		
		rs.close();
		pstmt.close();
		conn.close();
		
		return result;
	}
	
	//로그인할떄 아이디가 있는건가 확인
	public void logintest(String id, String password) throws SQLException {
		String sql = "SELECT id,password FROM MUSINSAPEOPLE m \r\n"
				+ "WHERE id = ? AND PASSWORD = ?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			rs.getString(1);
			rs.getString(2);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	
	public void logintest2(String id, String password) {
		
	}
	
	//MusinsaMs Id,비밀번호 생성
	public int insertMs (MusinsaMsVo vo) throws SQLException {
		String sql = "INSERT INTO MUSINSAMS VALUES (?,?)";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getId());
		pstmt.setString(1, vo.getPassword());
		
		int result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return  result;
	}
	
	
	}
