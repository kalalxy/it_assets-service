package com.fhq.dao;

import com.fhq.model.UserInfo;

public interface UserInfoMapper {

    int deleteByPrimaryKey(Integer idKey);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer idKey);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}