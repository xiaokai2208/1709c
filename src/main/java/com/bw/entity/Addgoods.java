package com.bw.entity;

public class Addgoods {
	private Integer id;
	private String name;
	private String chicun;
	private String danjia;
	private String shuliang;
	private String biaoqian;
	public Addgoods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Addgoods(Integer id, String name, String chicun, String danjia, String shuliang, String biaoqian) {
		super();
		this.id = id;
		this.name = name;
		this.chicun = chicun;
		this.danjia = danjia;
		this.shuliang = shuliang;
		this.biaoqian = biaoqian;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChicun() {
		return chicun;
	}
	public void setChicun(String chicun) {
		this.chicun = chicun;
	}
	public String getDanjia() {
		return danjia;
	}
	public void setDanjia(String danjia) {
		this.danjia = danjia;
	}
	public String getShuliang() {
		return shuliang;
	}
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	public String getBiaoqian() {
		return biaoqian;
	}
	public void setBiaoqian(String biaoqian) {
		this.biaoqian = biaoqian;
	}
	@Override
	public String toString() {
		return "Addgoods [id=" + id + ", name=" + name + ", chicun=" + chicun + ", danjia=" + danjia + ", shuliang="
				+ shuliang + ", biaoqian=" + biaoqian + "]";
	}
	
}
