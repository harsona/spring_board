package com.harsona.spring_board.dto;

public class ContentDto {
	
	private int mId;
	private String mName;
	private String mPhone;
	private String mAddress;
	private String mDate;

	public ContentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContentDto(int mId, String mName, String mPhone, String mAddress, String mDate) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
		this.mDate = mDate;
	}

	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getmAddress() {
		return mAddress;
	}
	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public String getmDate() {
		return mDate;
	}
	public void setmDate(String mDate) {
		this.mDate = mDate;
	}
}
