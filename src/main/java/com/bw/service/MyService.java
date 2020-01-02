package com.bw.service;

import java.util.List;

import com.bw.entity.Addgoods;
import com.bw.entity.Brand;
import com.bw.entity.Brandxiu;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.entity.Goodskinds;
import com.bw.entity.Goodskindxiu;

public interface MyService {
	public List<Goodskind> list(String mohu);
	public int add(Addgoods goods,String pin,String zhou);
	public List<Goods> show(Integer id);
	public List<Goodskinds> showpin(Integer id);
	public List<Brand> showzhou(Integer id);
	public int shan(Integer id);
	public List<Goodskinds> huipin();
	public List<Brand> huizhou();
	public int xiu(Goods goods,Goodskindxiu goodskindxiu,Brandxiu brandxiu);
}
