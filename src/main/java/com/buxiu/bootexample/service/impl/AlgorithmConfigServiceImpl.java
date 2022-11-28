package com.buxiu.bootexample.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.buxiu.bootexample.service.IAlgorithmConfigService;
import com.buxiu.bootexample.service.common.BizErrorCode;
import com.buxiu.bootexample.service.common.BizException;
import com.buxiu.bootexample.mapper.AlgorithmConfigMapper;
import com.buxiu.bootexample.po.AlgorithmConfigPo;
/**
*
*  AlgorithmConfigServiceImpl.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/


@Component("algorithmConfigService")
public class AlgorithmConfigServiceImpl implements IAlgorithmConfigService {

    private Logger log = LoggerFactory.getLogger(AlgorithmConfigServiceImpl.class);

    @Qualifier("algorithmConfigMapper")
    @Autowired
    private AlgorithmConfigMapper algorithmConfigMapper;

    @Override
    public List<AlgorithmConfigPo> findAlgorithmConfigsByPage(AlgorithmConfigPo param) {
        log.debug("findAlgorithmConfigsByPage starting...");
        List<AlgorithmConfigPo> algorithmConfigs = null;
        try {
            algorithmConfigs = algorithmConfigMapper.findAlgorithmConfigsByPage(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("findAlgorithmConfigsByPage end");
        return algorithmConfigs;
    }

    @Override
    public AlgorithmConfigPo getAlgorithmConfigById(Integer algorithmid) {
        log.debug("getAlgorithmConfig starting...");
        AlgorithmConfigPo algorithmConfig = null;
        try {
            algorithmConfig = algorithmConfigMapper.getAlgorithmConfigById(algorithmid);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("getAlgorithmConfig end");
        return algorithmConfig;
    }

    @Override
    public AlgorithmConfigPo getAlgorithmConfigEx(AlgorithmConfigPo param) {
        log.debug("getAlgorithmConfigEx starting...");
        AlgorithmConfigPo algorithmConfig = null;
        try {
            algorithmConfig = algorithmConfigMapper.getAlgorithmConfigEx(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("getAlgorithmConfigEx end");
        return algorithmConfig;
    }

    @Override
    public Integer addAlgorithmConfig(AlgorithmConfigPo param) {
        log.debug("addAlgorithmConfig starting...");
        Integer retval = 0;
        try {
            retval = algorithmConfigMapper.addAlgorithmConfig(param);
            
            if (retval == 0) {
                throw new BizException(BizErrorCode.EX_DATABASE_ADD_FAIL);
            }
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("addAlgorithmConfig end");
        return param.getAlgorithmid();
    }

    @Override
    public int updateAlgorithmConfig(AlgorithmConfigPo param) {
        log.debug("updateAlgorithmConfig starting...");
        int retval = 0;
        try {
            retval = algorithmConfigMapper.updateAlgorithmConfig(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        if (retval == 0) {
            throw new BizException(BizErrorCode.EX_DATABASE_UPDATE_FAIL);
        }
        log.debug("updateAlgorithmConfig end");
        return retval;
    }

    @Override
    public int deleteAlgorithmConfigById(Integer algorithmid) {
        log.debug("deleteAlgorithmConfig starting...");
        int retval = 0;
        try {
            retval = algorithmConfigMapper.deleteAlgorithmConfigById(algorithmid);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("deleteAlgorithmConfig end");
        return retval;
    }

    @Override
    public int deleteAlgorithmConfigEx(AlgorithmConfigPo param) {
        log.debug("deleteAlgorithmConfigEx starting...");
        int retval = 0;
        try {
            retval = algorithmConfigMapper.deleteAlgorithmConfigEx(param);
        } catch (SQLException ex) {
            log.error("exception:", ex);
            throw new BizException(BizErrorCode.EX_DATABASE_TRANSACTION_FAIL);
        }
        log.debug("deleteAlgorithmConfigEx end");
        return retval;
    }
}