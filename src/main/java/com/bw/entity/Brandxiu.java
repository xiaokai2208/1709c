package com.bw.entity;

public class Brandxiu {
	private Integer xiuid;
	private String xiuname;
	public Brandxiu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brandxiu(Integer xiuid, String xiuname) {
		super();
		this.xiuid = xiuid;
		this.xiuname = xiuname;
	}
	Integer getXiuid() {
		return xiuid;
	}
	void setXiuid(Integer xiuid) {
		this.xiuid = xiuid;
	}
	String getXiuname() {
		return xiuname;
	}
	void setXiuname(String xiuname) {
		this.xiuname = xiuname;
	}
	@Override
	public String toString() {
		return "Brandxiu [xiuid=" + xiuid + ", xiuname=" + xiuname + "]";
	}
	
}
