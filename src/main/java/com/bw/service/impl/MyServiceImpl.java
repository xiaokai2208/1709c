package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.entity.Addgoods;
import com.bw.entity.Brand;
import com.bw.entity.Brandxiu;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.entity.Goodskinds;
import com.bw.entity.Goodskindxiu;
import com.bw.mapper.MyMapper;
import com.bw.service.MyService;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	private MyMapper mymapper;
	public List<Goodskind> list(String mohu) {
		// TODO Auto-generated method stub
		return mymapper.list(mohu);
	}
	public int add(Addgoods goods, String pin, String zhou) {
		// TODO Auto-generated method stub
		int add = mymapper.add(goods);
		int addpin = mymapper.addpin(goods.getId(), pin);
		int addzhou = mymapper.addzhou(goods.getId(), zhou);
		
		return 1;
	}
	public List<Goods> show(Integer id) {
		// TODO Auto-generated method stub
		return mymapper.show(id);
	}
	public List<Goodskinds> showpin(Integer id) {
		// TODO Auto-generated method stub
		return mymapper.showpin(id);
	}
	public List<Brand> showzhou(Integer id) {
		// TODO Auto-generated method stub
		return mymapper.showzhou(id);
	}
	public int shan(Integer id) {
		// TODO Auto-generated method stub
		
		int shanpin = mymapper.shanpin(id);
		int shanzhou = mymapper.shanzhou(id);
		int shan = mymapper.shan(id);
		return 1;
	}
	public List<Goodskinds> huipin() {
		// TODO Auto-generated method stub
		
		return mymapper.huipin();
	}
	public List<Brand> huizhou() {
		// TODO Auto-generated method stub
		return mymapper.huizhou();
	}
	public int xiu(Goods goods,Goodskindxiu goodskindxiu,Brandxiu brandxiu) {
		// TODO Auto-generated method stub
		int xiu = mymapper.xiu(goods);
		int xiupin = mymapper.xiupin(goodskindxiu);
		int xiuzhou = mymapper.xiuzhou(brandxiu);
		return 1;
	}

}
