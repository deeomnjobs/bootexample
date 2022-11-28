package com.buxiu.example.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.buxiu.example.service.IBrandService;
import com.buxiu.example.service.common.BizErrorCode;
import com.buxiu.example.service.common.BizException;
import com.buxiu.example.mapper.BrandMapper;
import com.buxiu.example.po.BrandPo;
/**
*
*  BrandServiceImpl.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/


@Component("brandService")
public class BrandServiceImpl implements IBrandService {

    private Logger log = LoggerFactory.getLogger(BrandServiceImpl.class);

    @Qualifier("brandMapper")
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<BrandPo> findBrandsByPage(BrandPo param) {
        log.debug("findBrandsByPage starting...");
        List<BrandPo> brands = null;
        try {
            brands = brandMapper.findBrandsByPage(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("findBrandsByPage end");
        return brands;
    }

    @Override
    public BrandPo getBrandById(Integer id) {
        log.debug("getBrand starting...");
        BrandPo brand = null;
        try {
            brand = brandMapper.getBrandById(id);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("getBrand end");
        return brand;
    }

    @Override
    public BrandPo getBrandEx(BrandPo param) {
        log.debug("getBrandEx starting...");
        BrandPo brand = null;
        try {
            brand = brandMapper.getBrandEx(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("getBrandEx end");
        return brand;
    }

    @Override
    public Integer addBrand(BrandPo param) {
        log.debug("addBrand starting...");
        Integer retval = 0;
        try {
            retval = brandMapper.addBrand(param);
            
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_DATABASE_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("addBrand end");
        return param.getId();
    }

    @Override
    public int updateBrand(BrandPo param) {
        log.debug("updateBrand starting...");
        int retval = 0;
        try {
            retval = brandMapper.updateBrand(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        if (retval == 0) {
            throw new BizException(BizErrorCode.EX_DATABASE_UPDATE_FAIL);
        }
        log.debug("updateBrand end");
        return retval;
    }

    @Override
    public int deleteBrandById(Integer id) {
        log.debug("deleteBrand starting...");
        int retval = 0;
        try {
            retval = brandMapper.deleteBrandById(id);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("deleteBrand end");
        return retval;
    }

    @Override
    public int deleteBrandEx(BrandPo param) {
        log.debug("deleteBrandEx starting...");
        int retval = 0;
        try {
            retval = brandMapper.deleteBrandEx(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("deleteBrandEx end");
        return retval;
    }
}