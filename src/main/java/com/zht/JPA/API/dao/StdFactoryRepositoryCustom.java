package com.zht.JPA.API.dao;
/**
 * 分厂  持久层自定义  接口
 * @author haitao.zhang 2018-11-8
 * @version 1.0
 */

import java.util.List;
import com.zht.JPA.API.pojo.stdFactory;
import com.zht.JPA.COMMON.Pagination;
import com.zht.JPA.COMMON.PaginationBean;
import com.zht.JPA.COMMON.util.CommonResult;

public interface StdFactoryRepositoryCustom {
	
	/**
	 * 分厂信息     更新（持久层）
	 * @param stdFactory 分厂信息
	 * @return
	 */
	CommonResult updateStdFactory(stdFactory stdFactory);
	
	/**
	 * 分厂信息     删除（持久层）
	 * @param facIDs 分厂id数组
	 * @return
	 */
	CommonResult deleteStdFactory(Long[] facIDs);
	
	/**
	 * 分厂信息     得到某个分厂（持久层）
	 * @param facID 分厂id
	 * @return
	 */
	stdFactory getSingleStdFactory(Long facID);
	
	/**
	 * 分厂信息     得到多个分厂（持久层）
	 * @param facIDs 分厂id数组
	 * @return
	 */
	List<stdFactory> getStdFactoryList(Long[] facIDs);
	
	/**
	 * 分厂信息     分页获得分厂列表（持久层）
	 * @param page 分页对象
	 * @param name 模糊查询条件   分厂编码   分厂名称
	 * @return
	 */
	PaginationBean<stdFactory> getStdFactory(Pagination page,String name);
	
	/**
	 * 分厂信息    根据分厂编码校验（持久层）
	 * @param facCode 分厂编码
	 * @return
	 */
	List<Object[]> getSingleStdFactoryByCode(String facCode);
	
	/**
	 * 分厂信息    根据分厂名称校验（持久层）
	 * @param facName 分厂名称
	 * @return
	 */
	List<Object[]> getSingleStdFactoryByName(String facName);
	
	/**
	 * 分厂信息     得到多个分厂（持久层）用于excel导出
	 * @param facIDs 分厂id数组
	 * @param name   编码或者名称
	 * @return
	 */
	List<stdFactory> getStdFactoryListForExport();
}
