package com.buxiu.bootexample.po;

import java.io.Serializable;
import com.buxiu.bootexample.po.base.PageBean;

/**
*
*  数据库表：算法仓配置表
*
*  @Author bubuxiu@gmail.com
*
**/

public class AlgorithmConfigPo extends PageBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 自增加主键;NOTNULL;PRIMARYKEY */
	private Integer algorithmid;
	/** 算法code唯一标识;NOTNULL;MAXLENGTH(32) */
	private String algorithmcode;
	/** 算法中文名称;NOTNULL;MAXLENGTH(255) */
	private String algorithmname;
	/** 算法分类code;NOTNULL;MAXLENGTH(32) */
	private String catalogcode;
	/** 算法分类中文名称;NOTNULL;MAXLENGTH(255) */
	private String catalogname;
	/** 0-启用，1-禁用;NOTNULL */
	private Integer status;
	/** 重复告警检测周期，为空或0表示不检测 */
	private Integer repeatedalarmtime;
	/** 算法所需硬件类型;MAXLENGTH(32) */
	private String nodetype;
	/** 算法提供商;NOTNULL;MAXLENGTH(32) */
	private String vendor;
	/** 描述信息;MAXLENGTH(255) */
	private String description;
	/** 新增时间;MAXLENGTH(20) */
	private String addtime;
	/** 修改时间;MAXLENGTH(20) */
	private String updatetime;


	// 数据库表字段之外的属性定义从这里开始，请遵循注释规范


	public Integer getAlgorithmid(){
		return algorithmid;
	}
	public void setAlgorithmid(Integer algorithmid){
		 this.algorithmid=algorithmid;
	}
	public String getAlgorithmcode(){
		return algorithmcode;
	}
	public void setAlgorithmcode(String algorithmcode){
		 this.algorithmcode=algorithmcode;
	}
	public String getAlgorithmname(){
		return algorithmname;
	}
	public void setAlgorithmname(String algorithmname){
		 this.algorithmname=algorithmname;
	}
	public String getCatalogcode(){
		return catalogcode;
	}
	public void setCatalogcode(String catalogcode){
		 this.catalogcode=catalogcode;
	}
	public String getCatalogname(){
		return catalogname;
	}
	public void setCatalogname(String catalogname){
		 this.catalogname=catalogname;
	}
	public Integer getStatus(){
		return status;
	}
	public void setStatus(Integer status){
		 this.status=status;
	}
	public Integer getRepeatedalarmtime(){
		return repeatedalarmtime;
	}
	public void setRepeatedalarmtime(Integer repeatedalarmtime){
		 this.repeatedalarmtime=repeatedalarmtime;
	}
	public String getNodetype(){
		return nodetype;
	}
	public void setNodetype(String nodetype){
		 this.nodetype=nodetype;
	}
	public String getVendor(){
		return vendor;
	}
	public void setVendor(String vendor){
		 this.vendor=vendor;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		 this.description=description;
	}
	public String getAddtime(){
		return addtime;
	}
	public void setAddtime(String addtime){
		 this.addtime=addtime;
	}
	public String getUpdatetime(){
		return updatetime;
	}
	public void setUpdatetime(String updatetime){
		 this.updatetime=updatetime;
	}

}
