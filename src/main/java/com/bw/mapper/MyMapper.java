package com.bw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Addgoods;
import com.bw.entity.Brand;
import com.bw.entity.Brandxiu;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.entity.Goodskinds;
import com.bw.entity.Goodskindxiu;

public interface MyMapper {
	public List<Goodskind> list(@Param("mohu")String mohu);
	public int add(Addgoods goods);
	public int addpin(@Param("id")Integer id,@Param("name")String name);
	public int addzhou(@Param("id")Integer id,@Param("name")String name);
	public List<Goods> show(Integer id);
	public List<Goodskinds> showpin(Integer id);
	public List<Brand> showzhou(Integer id);
	public int shan(Integer id);
	public int shanpin(Integer id);
	public int shanzhou(Integer id);
	public List<Goodskinds> huipin();
	public List<Brand> huizhou();
	public int xiu(Goods goods);
	public int xiupin(Goodskindxiu goodskinds);
	public int xiuzhou(Brandxiu brandxiu);
}
