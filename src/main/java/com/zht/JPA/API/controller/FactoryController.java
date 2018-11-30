package com.zht.JPA.API.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zht.JPA.API.common.Pagination;
import com.zht.JPA.API.common.PaginationBean;
import com.zht.JPA.API.dao.StdFactoryRepository;
import com.zht.JPA.API.pojo.stdFactory;

@RestController
@RequestMapping(value="com/zht/factory")
public class FactoryController {
	
	@Autowired
	private StdFactoryRepository stdFactoryRepository;
	
	@GetMapping()
	public PaginationBean<stdFactory> getStdFactory(Pagination page,String name){
		PaginationBean<stdFactory> pageFactory=new PaginationBean<>();
		if(StringUtils.isNotEmpty(name)) name=name.trim();//不等于空就去掉空格
			try {
				return stdFactoryRepository.getStdFactory(page, name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return pageFactory;
			}
	}
	
	@GetMapping("/getPage")
	public Page<stdFactory> getStdFactoryJPA(int pageIndex,int pageSize,String name){
		Page<stdFactory> pages=stdFactoryRepository.findAll(new PageRequest(pageIndex, pageSize));
		return pages;
	}
}
