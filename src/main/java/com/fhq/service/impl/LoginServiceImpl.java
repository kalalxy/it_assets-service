package com.fhq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fhq.dao.LoginMapper;
import com.fhq.model.Login;
import com.fhq.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    private Logger log = LoggerFactory.getLogger(LoginService.class);

    /**
     * 获取登陆用户
     *
     * @param params
     * @return
     */
    @Override
    public Login login(String params) {
        Login user = null;
        try {
            Map map = new HashMap();
            JSONObject obj = JSONObject.parseObject(params);
            map.put("idKey", obj.getString("idKey"));
            map.put("roleId", obj.getString("roleId"));
            map.put("account", obj.getString("account"));
            map.put("password", obj.getString("password"));
            user = this.loginMapper.selectByCondition(map);
            if (user == null || user.getAccount() == null) {
                throw new Exception("登录失败，账户或者秘密错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }

    /**
     * update user selective by primary key
     *
     * @param login
     * @return
     */
    @Override
    public Integer updateUserSelective(Login login) {
        Integer updateResult = null;
        try {
            updateResult = loginMapper.updateByPrimaryKeySelective(login);
        } catch (Exception e) {
            log.error("## error in updateUserSelective in [LoginService] e: " + e);
            updateResult = null;
        }
        return updateResult;
    }

    /**
     * remove users by idKeys
     *
     * @param idKeys idKeys includes the following parameter:
     *               idKey:[
     *               {
     *               "idKey":"idKey",
     *               ...
     *               }
     *               ]
     * @return
     */
    @Override
    public String removeUsers(String idKeys) {
        JSONArray outArr = new JSONArray();
        try {
            JSONArray array = JSONArray.parseArray(idKeys);
            for (int i = 0; i < array.size(); i++) {
                JSONObject tmpJson = new JSONObject();
                Integer idkey = (array.getJSONObject(i).getString("idKey") == null ? null : Integer.valueOf(array.getJSONObject(i).getString("idKey")));
                tmpJson.put("idKey", array.getJSONObject(i).getString("idKey"));
                /**
                 * do not allow to execute remove if the idkey is null
                 */
                if (null == idkey) {
                    tmpJson.put("removeResult", "-1");
                } else {
                    Integer removeResult = loginMapper.deleteByPrimaryKey(idkey);
                    tmpJson.put("removeResult", removeResult.toString());
                }
                /**
                 * add to result collection
                 */
                outArr.add(tmpJson);
            }
            return outArr.toJSONString();
        } catch (Exception e) {
            log.error("## error in removeUsers in [LoginService] e: " + e);
            return outArr.toJSONString();
        }
    }

    /**
     * 插入登录用户
     *
     * @param login
     * @return
     */
    @Override
    public Integer insertUser(Login login) {
        try {
            List<Login> selectResult = null;
            if (selectResult != null && selectResult.size() > 0) {
                return -1;
            }
            Integer insertResult = loginMapper.insertSelective(login);
            return insertResult;
        } catch (Exception e) {
            log.error("## error in insertUser in [LoginService] e: " + e);
            return -1;
        }
    }

}
