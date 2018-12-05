package com.zht.JPA.API.dao.compareInitial.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.zht.JPA.API.dao.common.BaseRepository;
import com.zht.JPA.API.dao.compareInitial.StdCompareInitialRepositoryCustom;
import com.zht.JPA.API.pojo.compareInitial.stdCompareInitial;

/**
 * 

* <p>Title: StdCompareInitialRepositoryImpl</p>  

* <p>Description: </p>  

* @author haitao.zhang  

* @date 2018年12月5日 上午11:23:18
 */
public class StdCompareInitialRepositoryImpl extends BaseRepository<stdCompareInitial, Integer> implements StdCompareInitialRepositoryCustom{

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	@Override
	public stdCompareInitial update(stdCompareInitial entity) {
		return getEntityManager().merge(entity);
	}
	
}
