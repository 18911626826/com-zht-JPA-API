package com.zht.JPA.API.service.compareInitial.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zht.JPA.API.common.CommonResult;
import com.zht.JPA.API.dao.compareInitial.StdCompareInitialRepository;
import com.zht.JPA.API.pojo.compareInitial.stdCompareInitial;
import com.zht.JPA.API.service.compareInitial.stdCompareInitialService;

/**
 * 

* <p>Title: StdCompareInitialServiceImpl</p>  

* <p>Description: </p>  

* @author haitao.zhang  

* @date 2018年12月5日 上午11:29:20
 */
@Service
public class StdCompareInitialServiceImpl implements stdCompareInitialService{
	
	@Autowired
	private StdCompareInitialRepository stdCompareInitialRepository;
	
	@Override
	public CommonResult add(stdCompareInitial entity) {
		// TODO Auto-generated method stub
		CommonResult cr=new CommonResult();
		try {
			stdCompareInitialRepository.saveAndFlush(entity);
			cr.setIsSuccess(true);
			cr.setMessage("添加成功！");
			//cr.setResult(entityRet);
		}catch(Exception e) {
			e.printStackTrace();
			cr.setIsSuccess(false);
			cr.setMessage("添加失败！");
		}
		return cr;
	}

	@Override
	public CommonResult update(stdCompareInitial entity) {
		// TODO Auto-generated method stub
				CommonResult cr=new CommonResult();
				try {
					stdCompareInitial entityRet=stdCompareInitialRepository.saveAndFlush(entity);
					cr.setIsSuccess(true);
					cr.setMessage("更新成功！");
					cr.setResult(entityRet);
				}catch(Exception e) {
					e.printStackTrace();
					cr.setIsSuccess(false);
					cr.setMessage("更新失败！");
				}
				return cr;
	}

	@Override
	public CommonResult delete(Integer ID) {
		// TODO Auto-generated method stub
		CommonResult cr=new CommonResult();
		try {
			stdCompareInitialRepository.delete(ID);
			cr.setIsSuccess(true);
			cr.setMessage("删除成功！");
		}catch(Exception e) {
			e.printStackTrace();
			cr.setIsSuccess(false);
			cr.setMessage("删除失败！");
		}
		return cr;
	}

	@Override
	public stdCompareInitial getOne(Integer ID) throws Exception{
		// TODO Auto-generated method stub
		try {
			return stdCompareInitialRepository.findOne(ID);
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("查询失败！");
		}
	}
	
}
