package com.zht.JPA.API.dao.compareInitial;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zht.JPA.API.pojo.compareInitial.stdCompareInitial;
/**
 * 

* <p>Title: StdCompareInitialRepository</p>  

* <p>Description: </p>  

* @author haitao.zhang  

* @date 2018年12月5日 上午11:10:16
 */
public interface StdCompareInitialRepository extends JpaRepository<stdCompareInitial,Integer>,StdCompareInitialRepositoryCustom{

}
