package com.harsona.spring_board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ContentDao {
	
	JdbcTemplate template;
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public ContentDao() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ArrayList<ContentDto> listDao(){
		return ((IDao) sqlSession).listDao();
	}

	@Override
	public void writeDao(final String mWriter, final String mContent) {
		System.out.println("writeDao()");
	}
	
	@Override
	public ContentDto viewDao(String strID) {
		return ((IDao) sqlSession).viewDao(strID);
	}

	@Override
	public void deleteDao(final String bId) {
		System.out.println("deleteDao()");
	}
}
