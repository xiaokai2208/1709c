package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.entity.Addgoods;
import com.bw.entity.Brand;
import com.bw.entity.Brandxiu;
import com.bw.entity.Goods;
import com.bw.entity.Goodskind;
import com.bw.entity.Goodskinds;
import com.bw.entity.Goodskindxiu;
import com.bw.service.MyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MyController {
	@Autowired
	private MyService myservice;
	@RequestMapping("list")
	public String test(Model m,String mohu,@RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum,@RequestParam(name = "pageSize",defaultValue = "2")Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Goodskind> list = myservice.list(mohu);
		PageInfo<Goodskind> pageInfo = new PageInfo<Goodskind>(list);
		m.addAttribute("page", pageInfo);
		m.addAttribute("list", list);
		return "list";
	}
	@RequestMapping("add")
	public String test1(Addgoods add,String pin,String zhou) {
		int add2 = myservice.add(add, pin, zhou);
		System.out.println(add2);
		return "redirect:/list";
	}
	@RequestMapping("show")
	public String test2(Model m,Integer id) {
		List<Goods> show = myservice.show(id);
		List<Goodskinds> showpin = myservice.showpin(id);
		List<Brand> showzhou = myservice.showzhou(id);
		m.addAttribute("list", show);
		m.addAttribute("showpin", showpin);
		m.addAttribute("showzhou", showzhou);
		return "show";
	}
	@RequestMapping("shan")
	public String test3(Integer id) {
		int shan2 = myservice.shan(id);
		System.out.println(shan2);
		if (shan2==0) {
			return "删除失败";
		}
		return "redirect:/list";
	}
	@RequestMapping("huipin")
	@ResponseBody
	public List<Goodskinds> huipin(){
		return myservice.huipin();
	}
	@RequestMapping("huizhou")
	@ResponseBody
	public List<Brand> huizhou(){
		return myservice.huizhou();
	}
	@RequestMapping("xiu")
	public String test4(Goods goods,Goodskindxiu goodskindxiu,Brandxiu brandxiu) {
		myservice.xiu(goods, goodskindxiu, brandxiu);
		return "redirect:/list";
	}
}
