package com.fhq.service;

import com.fhq.model.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**
     * 新增用户信息，用户账号不能重复
     * @param entity
     * @return
     */
    Integer insertUserInfo(UserInfo entity);

    /**
     * 删除用户信息
     * @param entity
     * @return
     */
    Integer removeUserInfo(UserInfo entity);

    /**
     * 更新用户信息
     * @param entity
     * @return
     */
    Integer updateUserInfo(UserInfo entity);

    /**
     * 获取用户信息
     * @param entity
     * @return
     */
    List<UserInfo> getUserInfo(UserInfo entity);
}
