package com.buxiu.bootexample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buxiu.bootexample.interceptor.PageInfo;
import com.buxiu.bootexample.controller.base.BaseCtrl;
import com.buxiu.bootexample.controller.model.RSResult;
import com.buxiu.bootexample.po.AlgorithmConfigPo;
import com.buxiu.bootexample.service.common.BizException;
import com.buxiu.bootexample.service.impl.AlgorithmConfigServiceImpl;

/**
*
*  AlgorithmConfigController.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/

@RestController 
@RequestMapping("/algorithmConfig")
public class AlgorithmConfigController extends BaseCtrl {

    @Autowired
    private AlgorithmConfigServiceImpl algorithmConfigService;

    /** 
    *  查询列表
    *
    **/
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public RSResult list(@RequestBody AlgorithmConfigPo param) {
        RSResult result = new RSResult();
        try {
            List<AlgorithmConfigPo> list =  algorithmConfigService.findAlgorithmConfigsByPage(param); 
            PageInfo<AlgorithmConfigPo> page = (PageInfo<AlgorithmConfigPo>)list;
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
    *  根据主键查询详情
    *
    **/
    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public RSResult detail(@RequestBody AlgorithmConfigPo param) {
        RSResult result = new RSResult();
        try { 
            AlgorithmConfigPo obj = algorithmConfigService.getAlgorithmConfigById(param.getAlgorithmid());
            result.setResult(0);
            result.setData(obj);
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }

    /** 
    *  添加记录
    *
    **/
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public RSResult add(@RequestBody AlgorithmConfigPo param) { 
        RSResult result = new RSResult();
        try {
            Integer id = algorithmConfigService.addAlgorithmConfig(param);
            result.setResult(0);
            result.setData(id);
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }

    /** 
    *  更新记录
    *
    **/
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public RSResult update(@RequestBody AlgorithmConfigPo param) {
        RSResult result = new RSResult();
        try { 
            algorithmConfigService.updateAlgorithmConfig(param);
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
    public RSResult delete(@RequestBody AlgorithmConfigPo param) {
        RSResult result = new RSResult();
        try { 
            algorithmConfigService.deleteAlgorithmConfigById(param.getAlgorithmid());
            result.setResult(0);
            result.setMessage("删除成功！");
        } catch (BizException ex) {
            log.error("{} : {}", ex.getErrorcode(), ex.getDescription());
            result.setResult(ex.getErrorcode());
        }
        return result;
    }
}