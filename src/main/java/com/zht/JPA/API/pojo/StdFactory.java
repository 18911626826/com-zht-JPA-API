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
@Table(name="STD_FACTORY",schema="DBO")
public class StdFactory {
	
	/**
	 * 分厂id
	 */
	@Id
	@Column(name="FAC_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long facID;
	
	/**
	 * 分厂编码
	 */
	@Column(name="FAC_CODE")
	private String facCode;
	
	/**
	 * 分厂名称
	 */
	@Column(name="FAC_NAME")
	private String facName;
	
	/**
	 * 分厂排序
	 */
	@Column(name="FAC_NO")
	private Integer facNO;

	/**
	 * 分厂删除标记   默认：0
	 */
	@Column(name="FAC_IS_DELETE")
	private Integer facIsDelete;
	
	/**
	 * 分厂信息创建者
	 */
	@Column(name="FAC_CREATE_USER")
	private String facCreateUser;
	
	/**
	 * 分厂信息创建时间
	 */
	@Column(name="FAC_CREATE_TIME")
	private Timestamp facCreateTime;
	
	/**
	 * 分厂信息修改者
	 */
	@Column(name="FAC_UPDATE_USER")
	private String facUpdateUser;
	
	/**
	 * 分厂信息修改时间
	 */
	@Column(name="FAC_UPDATE_TIME")
	private Timestamp facUpdateTime;
	
	/**
	 * 分厂信息  所属企业ID
	 */
	@Column(name="ORG_ID")
	//企业ID
	private Integer orgId;
	
	//企业名称
	@Transient
	private String orgName;
	
	public StdFactory() {super();};
	
	public StdFactory(String facCode, String facName, Integer facNO, String orgName) {
		super();
		this.facCode = facCode;
		this.facName = facName;
		this.facNO = facNO;
		this.orgName = orgName;
	}
	
	public StdFactory(Long facID, String facCode, String facName, Integer facNO, String orgName,Integer orgId) {
		super();
		this.facID = facID;
		this.facCode = facCode;
		this.facName = facName;
		this.facNO = facNO;
		this.orgName = orgName;
		this.orgId=orgId;
	}

	public Long getFacID() {
		return facID;
	}

	public void setFacID(Long facID) {
		this.facID = facID;
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
		return facNO;
	}

	public void setFacNO(Integer facNO) {
		this.facNO = facNO;
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
