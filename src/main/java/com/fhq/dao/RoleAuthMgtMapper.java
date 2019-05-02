package com.fhq.dao;

import com.fhq.model.RoleAuthMgt;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleAuthMgtMapper {

    /**
     * 根据条件进行查询，条件应该包括> , < 或者=
     * @param condition
     * @return
     */
    List<RoleAuthMgt> selectByCondition(Map condition);

    int deleteByPrimaryKey(Integer idKey);

    int insert(RoleAuthMgt record);

    int insertSelective(RoleAuthMgt record);

    RoleAuthMgt selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(RoleAuthMgt record);

    int updateByPrimaryKey(RoleAuthMgt record);
}