package com.fhq.dao;

import com.fhq.model.OprRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OprRecordMapper {

    /**
     * 根据查询条件进行查询 条件应该包括> , < 或者=
     * @param condition
     * @return
     */
    List<OprRecord> selectByCondition(Map condition);

    int deleteByPrimaryKey(Integer idKey);

    int insert(OprRecord record);

    int insertSelective(OprRecord record);

    OprRecord selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(OprRecord record);

    int updateByPrimaryKeyWithBLOBs(OprRecord record);

    int updateByPrimaryKey(OprRecord record);
}