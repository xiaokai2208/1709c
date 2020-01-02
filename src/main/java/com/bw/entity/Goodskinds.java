package com.bw.entity;

public class Goodskinds {
	private Integer id;
	private String name;
	public Goodskinds() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goodskinds(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Goodskinds [id=" + id + ", name=" + name + "]";
	}
	
}
