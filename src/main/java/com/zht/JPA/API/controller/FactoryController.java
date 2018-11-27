package com.zht.JPA.API.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zht.JPA.API.common.Pagination;
import com.zht.JPA.API.common.PaginationBean;
import com.zht.JPA.API.dao.StdFactoryRepository;
import com.zht.JPA.API.pojo.StdFactory;

/*@CrossOrigin
@RestController
@RequestMapping(value="com/zht/factory")*/
//@EnableAutoConfiguration
@RestController
@RequestMapping(value="com/zht/factory")
public class FactoryController {
	
	@Autowired
	private StdFactoryRepository stdFactoryRepository;
	
	@GetMapping()
	public PaginationBean<StdFactory> getStdFactory(Pagination page,String name){
		PaginationBean<StdFactory> pageFactory=new PaginationBean<>();
		if(StringUtils.isNotEmpty(name)) name=name.trim();//不等于空就去掉空格
			try {
				return stdFactoryRepository.getStdFactory(page, name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return pageFactory;
			}
	}
}
