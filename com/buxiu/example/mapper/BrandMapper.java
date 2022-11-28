package com.buxiu.example.mapper;

import java.sql.SQLException;
import java.util.List;
import com.buxiu.example.po.BrandPo;

/**
*
*  BrandMapper.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/

public interface BrandMapper extends ISqlMapper {

    public int countBrands(BrandPo param) throws SQLException;

    public List<BrandPo> findBrandsByPage(BrandPo param) throws SQLException;

    public BrandPo getBrandById(Integer id) throws SQLException;

    public BrandPo getBrandEx(BrandPo param) throws SQLException;

    public Integer addBrand(BrandPo param) throws SQLException;

    public int updateBrand(BrandPo param) throws SQLException;

    public int deleteBrandById(Integer id) throws SQLException;

    public int deleteBrandEx(BrandPo param) throws SQLException;

}
