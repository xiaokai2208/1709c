package com.bw.entity;

public class Goodskindxiu {
	private Integer xiuid;
	private String xiuname;
	public Goodskindxiu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodskindxiu(Integer xiuid, String xiuname) {
		super();
		this.xiuid = xiuid;
		this.xiuname = xiuname;
	}
	public Integer getXiuid() {
		return xiuid;
	}
	public void setXiuid(Integer xiuid) {
		this.xiuid = xiuid;
	}
	public String getXiuname() {
		return xiuname;
	}
	public void setXiuname(String xiuname) {
		this.xiuname = xiuname;
	}
	@Override
	public String toString() {
		return "Goodskindxiu [xiuid=" + xiuid + ", xiuname=" + xiuname + "]";
	}
	
}
