package com.bitstudy.qna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.util.ConnectionPool;
import kr.co.mlec.util.JdbcUtil;
import qna.domain.Qna;

public class QnaDAO {
	List<Qna> list = new ArrayList<>();
	Connection con = null;
	PreparedStatement stmt = null;
	
	public List<Qna> selectList() {
		try {
		con  = ConnectionPool.getConnection();
		Qna qnal = new Qna();
		StringBuffer sql = new StringBuffer();
		sql.append("select no,group_no,title,name,reg_date,read_count ");
		sql.append(" from t97_qna ");
		sql.append(" order by no desc ");
		
		stmt = con.prepareStatement(sql.toString());
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			qnal.setNo(rs.getInt("no"));
			qnal.setGroupNo(rs.getInt("group_no"));
			qnal.setTitle(rs.getString("title"));
			qnal.setName(rs.getString("name"));
			qnal.setRegDate(rs.getDate("reg_date"));
			qnal.setReadCount(rs.getInt("read_count"));
			list.add(qnal);
		}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			ConnectionPool.releaseConnection(con);
		}
		return list;
	}
	
		public Qna selectQnaByNo(int no) {
			try {
				con = ConnectionPool.getConnection();
				Qna qnal = new Qna();
				StringBuffer sql = new StringBuffer();
				sql.append("select no,group_no,title,name,reg_date,read_count,content "); // select * 
				sql.append("  from t97_qna ");
				sql.append(" where no = ?");
				
				stmt = con.prepareStatement(sql.toString());
				stmt.setInt(1, no);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					qnal.setNo(rs.getInt("no"));
					qnal.setGroupNo(rs.getInt("group_no"));
					qnal.setTitle(rs.getString("title"));
					qnal.setName(rs.getString("name"));
					qnal.setRegDate(rs.getDate("reg_date"));
					qnal.setReadCount(rs.getInt("read_count"));
					qnal.setContent(rs.getString("content"));
					
					return qnal;
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				JdbcUtil.close(stmt);
				ConnectionPool.releaseConnection(con);
			}
			return null;
		}
		
		public void readCount(int no) {//조회수
			try {
				con = ConnectionPool.getConnection();
				StringBuffer sql = new StringBuffer();
				sql.append("update set read_count = read_count + 1 ");
				sql.append(" t97_qna ");
				sql.append(" where groupNo = ? ");
				stmt = con.prepareStatement(sql.toString());
				stmt.setInt(1,no);
				stmt.executeUpdate();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	public void insertQ(Qna b) {//질문용 글작성
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into no, group_no,content,title,name ");
			sql.append(" from t97_qna ");
			sql.append(" values(qna_no.nextval,?,?,?,? ");
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1,b.getGroupNo());//답변인지 아닌지 확인하는값
			stmt.setString(2, b.getContent());
			stmt.setString(3, b.getTitle());
			stmt.setString(4, b.getName());
			stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			ConnectionPool.releaseConnection(con);
		}
	}
	public void insertA(Qna b) {//답변용 글작성
		try {
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into no, group_no,content,title,name " );
			sql.append(" from t97_qna ");
			sql.append(" values(?,?,?,?,?)" );
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, b.getNo());// 원글 시퀀스 번호 가져오기
			stmt.setInt(2, b.getGroupNo());// 답변인지 아닌지 확인하는값
			stmt.setString(3, b.getContent());
			stmt.setString(4, b.getName());
			stmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			ConnectionPool.releaseConnection(con);
		}
	}
	public void update(Qna b) { //그룹no로 질문 답변 확인하기
		try {
		con = ConnectionPool.getConnection();
		StringBuffer sql = new StringBuffer();
		sql.append("update set content = ? ,");
		sql.append(" title = ? ");
		sql.append(" from t97_qna ");
		sql.append(" where no = ? ");
		sql.append(" and groupNo = ? ");
		stmt = con.prepareStatement(sql.toString());
		stmt.setString(1, b.getContent());
		stmt.setString(2, b.getTitle());
		stmt.setInt(3, b.getNo());
		stmt.setInt(4, b.getGroupNo());
		stmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(stmt);
			ConnectionPool.releaseConnection(con);
		}
	}
	public Boolean delete(Qna d) {
		int cnt = -1;
		try {
			con = ConnectionPool.getConnection();//답글 지우는거 확인하기
			StringBuffer sql = new StringBuffer();
			sql.append("delete from tb_qna ");
			sql.append(" where name = ? ");
			sql.append(" and no = ? ");
			sql.append(" and group_no = ? ");
			stmt = con.prepareStatement(sql.toString());
			int dy = 0;
			stmt.setString(++dy, d.getName());
			stmt.setInt(++dy, d.getNo());
			stmt.setInt(++dy, d.getGroupNo());
			cnt = stmt.executeUpdate();
			
			}catch(Exception e) {
			e.printStackTrace();
			}finally {
			JdbcUtil.close(stmt);
			ConnectionPool.releaseConnection(con);
		}
		if(cnt == -1) {
			return false;
		}
		return true;
	}
}
