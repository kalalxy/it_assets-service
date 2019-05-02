package com.fhq.dao;

import com.fhq.model.AssetInfo;
import com.fhq.model.CrrInventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CrrInventoryMapper {

    /**
     * 根据给出条件进行查询,条件应该包括 >,<或者=
     * @param condition
     * @return
     */
    List<CrrInventory> selectByCondition(Map condition);

    int updateByAssetNoSelective(CrrInventory crrInventory);

    int deleteByPrimaryKey(Integer idKey);

    int insert(CrrInventory record);

    int insertSelective(CrrInventory record);

    CrrInventory selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(CrrInventory record);

    int updateByPrimaryKey(CrrInventory record);
}