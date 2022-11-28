package com.buxiu.example.po;

import java.io.Serializable;
import com.buxiu.example.po.base.PageBean;

/**
*
*  数据库表：
*
*  @Author bubuxiu@gmail.com
*
**/

public class BrandPo extends PageBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/** null;NOTNULL;PRIMARYKEY */
	private Integer id;
	/** null;MAXLENGTH(20) */
	private String brand_name;
	/** null;MAXLENGTH(20) */
	private String company_name;
	private Integer ordered;
	/** null;MAXLENGTH(100) */
	private String description;
	private Integer status;


	// 数据库表字段之外的属性定义从这里开始，请遵循注释规范


	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		 this.id=id;
	}
	public String getBrand_name(){
		return brand_name;
	}
	public void setBrand_name(String brand_name){
		 this.brand_name=brand_name;
	}
	public String getCompany_name(){
		return company_name;
	}
	public void setCompany_name(String company_name){
		 this.company_name=company_name;
	}
	public Integer getOrdered(){
		return ordered;
	}
	public void setOrdered(Integer ordered){
		 this.ordered=ordered;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		 this.description=description;
	}
	public Integer getStatus(){
		return status;
	}
	public void setStatus(Integer status){
		 this.status=status;
	}

}
