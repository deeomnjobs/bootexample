package com.buxiu.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buxiu.example.interceptor.PageInfo;
import com.buxiu.example.controller.base.BaseCtrl;
import com.buxiu.example.controller.model.RSResult;
import com.buxiu.example.po.BrandPo;
import com.buxiu.example.service.common.BizException;
import com.buxiu.example.service.impl.BrandServiceImpl;

/**
*
*  BrandController.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/

@RestController 
@RequestMapping("/brand")
public class BrandController extends BaseCtrl {

    @Autowired
    private BrandServiceImpl brandService;

    /** 
    *  查询列表 (Auto generated code)  
    *
    **/
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public RSResult list(@RequestBody BrandPo param) {
        RSResult result = new RSResult();
        try {
            List<BrandPo> list =  brandService.findBrandsByPage(param); 
            PageInfo<BrandPo> page = (PageInfo<BrandPo>)list;

            result.setResult(0);
            result.setTotal(page.getTotal());
            result.setData(page.getList());
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }

    /** 
    *  根据主键查询详情 (Auto generated code)  
    *
    **/
    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public RSResult detail(@RequestBody BrandPo param) {
        RSResult result = new RSResult();
        try { 
            BrandPo obj = brandService.getBrandById(param.getId());
            result.setResult(0);
            result.setData(obj);
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }

    /** 
    *  添加记录 (Auto generated code)  
    *
    **/
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public RSResult add(@RequestBody BrandPo param) { 
        RSResult result = new RSResult();
        try {
            Integer id = brandService.addBrand(param);
            
            result.setResult(0);
            result.setData(id);
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }

    /** 
    *  更新记录 (Auto generated code)  
    *
    **/
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RSResult update(@RequestBody BrandPo param) {
        RSResult result = new RSResult();
        try { 
            brandService.updateBrand(param);
            result.setResult(0);
            result.setMessage("修改成功！");
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }

    /** 
    *  根据主键删除记录 (Auto generated code)  
    *
    **/
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public RSResult delete(@RequestBody BrandPo param) {
        RSResult result = new RSResult();
        try { 
            brandService.deleteBrandById(param.getId());
            result.setResult(0);
            result.setMessage("删除成功！");
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }
}