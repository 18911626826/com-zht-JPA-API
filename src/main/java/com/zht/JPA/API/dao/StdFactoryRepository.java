package com.zht.JPA.API.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import com.zht.JPA.API.pojo.stdFactory;

/**
 * 分厂  持久层  接口
 * @author haitao.zhang 2018-11-8
 * @version 1.0
 */
public interface StdFactoryRepository extends JpaRepository<stdFactory,Integer>,StdFactoryRepositoryCustom{
	
	/**
	 * 分厂信息     添加（持久层）
	 * @param facCode   分厂编码
	 * @param facName   分厂名称
	 * @param facNO     分厂排序
	 * @param facIsDelete    分厂删除标记
	 * @param facCreateTime  分厂创建时间
	 * @param facCreateUser  分厂创建用户
	 */
	@Transactional
	@Modifying
	@Query(value="insert dbo.STD_FACTORY (FAC_CODE,FAC_NAME,FAC_NO,FAC_CREATE_USER,ORG_ID) values (?1,?2,?3,?4,?5)",nativeQuery = true)
	void insert(String facCode,String facName,Integer facNO,String facCreateUser,Integer orgId);
	
	Page<stdFactory> findByFacIsDeleteNotNullAndFacCodeLikeOrFacNameLikeOrderByFacNo(@Param(value="facCode")String code,@Param(value="facName")String name,Pageable page);
}