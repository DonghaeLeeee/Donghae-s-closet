package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.OracleUtil;
import vo.MusinsaMsVo;

public class MusinsaMsDao {

	
	private static MusinsaMsDao dao = new MusinsaMsDao();
	private MusinsaMsDao() {};
	public static MusinsaMsDao getInstance() {
		return dao;
	}
	
	
	//MusinsaPeople 과 MusinsaMs ID,비밀번호 동일한가 확인
	public List<MusinsaMsVo> selectMs (String id, String password) throws SQLException {
		List<MusinsaMsVo> list = new ArrayList<>();
		String sql = "SELECT m.ID,m.PASSWORD FROM MUSINSAPEOPLE m \r\n"
				+ "JOIN musinsams ms\r\n"
				+ "ON m.ID = ms.ID\r\n"
				+ "WHERE m.id = ? AND ms.password = ?";
		Connection conn = OracleUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			list.add(new MusinsaMsVo(rs.getString(1), rs.getString(2)));
		}
		return list;
	}
}
