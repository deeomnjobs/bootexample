package com.buxiu.bootexample.service;

import java.util.List;
import com.buxiu.bootexample.po.AlgorithmConfigPo;

/**
*
*  IAlgorithmConfigService.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/

public interface IAlgorithmConfigService {

    public List<AlgorithmConfigPo> findAlgorithmConfigsByPage(AlgorithmConfigPo param) ;

    public AlgorithmConfigPo getAlgorithmConfigById(Integer algorithmid) ;

    public AlgorithmConfigPo getAlgorithmConfigEx(AlgorithmConfigPo param) ;

    public Integer addAlgorithmConfig(AlgorithmConfigPo param) ;

    public int updateAlgorithmConfig(AlgorithmConfigPo param) ;

    public int deleteAlgorithmConfigById(Integer algorithmid) ;

    public int deleteAlgorithmConfigEx(AlgorithmConfigPo param) ;

}
