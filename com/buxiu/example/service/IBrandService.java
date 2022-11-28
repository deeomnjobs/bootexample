package com.buxiu.example.service;

import java.util.List;
import com.buxiu.example.po.BrandPo;

/**
*
*  IBrandService.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/

public interface IBrandService {

    public List<BrandPo> findBrandsByPage(BrandPo param) ;

    public BrandPo getBrandById(Integer id) ;

    public BrandPo getBrandEx(BrandPo param) ;

    public Integer addBrand(BrandPo param) ;

    public int updateBrand(BrandPo param) ;

    public int deleteBrandById(Integer id) ;

    public int deleteBrandEx(BrandPo param) ;

}
