package com.fhq.dao;

import com.fhq.model.AssetInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AssetInfoMapper {

    /**
     * 根据给出条件进行查询,条件应该包括 >,<或者=
     * @param condition
     * @return
     */
    List<AssetInfo> selectByCondition(Map condition);

    int deleteByPrimaryKey(Integer idKey);

    int insert(AssetInfo record);

    int insertSelective(AssetInfo record);

    AssetInfo selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(AssetInfo record);

    int updateByPrimaryKey(AssetInfo record);
}