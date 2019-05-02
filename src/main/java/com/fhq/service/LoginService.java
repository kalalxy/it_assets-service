package com.fhq.service;

import com.fhq.model.Login;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LoginService {
    /**
     * 登录
     *
     * @param params
     * @return
     */
    Login login(String params);

    /**
     * update user selective by primary key
     *
     * @param login
     * @return
     */
    Integer updateUserSelective(Login login);

    /**
     * remove users by idKeys
     *
     * @param idKeys idKeys includes the following parameter:
     *                  idKey:[
     *                      {
     *                          "idKey":"idKey",
     *                          ...
     *                      }
     *                  ]
     * @return
     */
    String removeUsers(String idKeys);

    /**
     * 插入登录用户
     * @param login
     * @return
     */
    Integer insertUser(Login login);
}
