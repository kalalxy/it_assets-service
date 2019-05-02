package com.fhq.dao;

import com.fhq.model.InventoryMgt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InventoryMgtMapper {

    /**
     * 根据条件进行查询，条件应该包括> , < 或者=
     * @param condition
     * @return
     */
    List<InventoryMgt> selectByCondition(Map condition);

    int deleteByPrimaryKey(Integer idKey);

    int insert(InventoryMgt record);

    int insertSelective(InventoryMgt record);

    InventoryMgt selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(InventoryMgt record);

    int updateByPrimaryKey(InventoryMgt record);
}