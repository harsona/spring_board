package com.harsona.spring_board.dao;

import java.util.ArrayList;

import com.harsona.spring_board.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDao> listDao();
	public void writeDao(String mName, String mPhone, String mAddress, String mDate);
	public ContentDto viewDao(String mId);
	public void deleteDao(String mId);
	public void modifyDao(String mName, String mPhone, String mAddress, String mDate, String strID);

}
