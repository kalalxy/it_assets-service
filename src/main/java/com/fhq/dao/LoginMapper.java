package com.fhq.dao;

import com.fhq.model.Login;

import java.util.List;
import java.util.Map;

public interface LoginMapper {
    /**
     * 根据给出条件进行查询,条件应该包括 >,<或者=
     * @param condition
     * @return
     */
    Login selectByCondition(Map condition);

    int deleteByPrimaryKey(Integer idKey);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}
