package com.zht.JPA.API.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 分厂持久层映射实体类
 * @author haitao.zhang 2018-11-8
 * @version 1.0
 *
 */
@Entity
public class stdFactory {
	
	/**
	 * 分厂id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer facId;
	
	/**
	 * 分厂编码
	 */
	private String facCode;
	
	/**
	 * 分厂名称
	 */
	private String facName;
	
	/**
	 * 分厂排序
	 */
	private Integer facNo;

	/**
	 * 分厂删除标记   默认：0
	 */
	private Integer facIsDelete;
	
	/**
	 * 分厂信息创建者
	 */
	private String facCreateUser;
	
	/**
	 * 分厂信息创建时间
	 */
	private Timestamp facCreateTime;
	
	/**
	 * 分厂信息修改者
	 */
	private String facUpdateUser;
	
	/**
	 * 分厂信息修改时间
	 */
	private Timestamp facUpdateTime;
	
	/**
	 * 分厂信息  所属企业ID
	 */
	//企业ID
	private Integer orgId;
	
	//企业名称
	@Transient
	private String orgName;
	
	public stdFactory() {super();};
	
	public stdFactory(String facCode, String facName, Integer facNO, String orgName) {
		super();
		this.facCode = facCode;
		this.facName = facName;
		this.facNo = facNO;
		this.orgName = orgName;
	}
	
	public stdFactory(Integer facID, String facCode, String facName, Integer facNO, String orgName,Integer orgId) {
		super();
		this.facId = facID;
		this.facCode = facCode;
		this.facName = facName;
		this.facNo = facNO;
		this.orgName = orgName;
		this.orgId=orgId;
	}

	public Integer getFacID() {
		return facId;
	}

	public void setFacID(Integer facID) {
		this.facId = facID;
	}

	public String getFacCode() {
		return facCode;
	}

	public void setFacCode(String facCode) {
		this.facCode = facCode;
	}

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public Integer getFacNO() {
		return facNo;
	}

	public void setFacNO(Integer facNO) {
		this.facNo = facNO;
	}

	public Integer getFacIsDelete() {
		return facIsDelete;
	}

	public void setFacIsDelete(Integer facIsDelete) {
		this.facIsDelete = facIsDelete;
	}

	public String getFacCreateUser() {
		return facCreateUser;
	}

	public void setFacCreateUser(String facCreateUser) {
		this.facCreateUser = facCreateUser;
	}

	public Timestamp getFacCreateTime() {
		return facCreateTime;
	}

	public void setFacCreateTime(Timestamp facCreateTime) {
		this.facCreateTime = facCreateTime;
	}

	public String getFacUpdateUser() {
		return facUpdateUser;
	}

	public void setFacUpdateUser(String facUpdateUser) {
		this.facUpdateUser = facUpdateUser;
	}

	public Timestamp getFacUpdateTime() {
		return facUpdateTime;
	}

	public void setFacUpdateTime(Timestamp facUpdateTime) {
		this.facUpdateTime = facUpdateTime;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
}
