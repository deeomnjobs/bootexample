package com.buxiu.bootexample.mapper;

import java.sql.SQLException;
import java.util.List;
import com.buxiu.bootexample.po.AlgorithmConfigPo;

/**
*
*  AlgorithmConfigMapper.java (Auto generated code)
*
*  @Author bubuxiu@gmail.com
*
**/

public interface AlgorithmConfigMapper extends ISqlMapper {

    public int countAlgorithmConfigs(AlgorithmConfigPo param) throws SQLException;

    public List<AlgorithmConfigPo> findAlgorithmConfigsByPage(AlgorithmConfigPo param) throws SQLException;

    public AlgorithmConfigPo getAlgorithmConfigById(Integer algorithmid) throws SQLException;

    public AlgorithmConfigPo getAlgorithmConfigEx(AlgorithmConfigPo param) throws SQLException;

    public Integer addAlgorithmConfig(AlgorithmConfigPo param) throws SQLException;

    public int updateAlgorithmConfig(AlgorithmConfigPo param) throws SQLException;

    public int deleteAlgorithmConfigById(Integer algorithmid) throws SQLException;

    public int deleteAlgorithmConfigEx(AlgorithmConfigPo param) throws SQLException;

}
