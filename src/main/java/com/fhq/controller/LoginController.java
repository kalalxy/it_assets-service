package com.fhq.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fhq.model.Login;
import com.fhq.service.LoginService;
import com.fhq.util.Constants;
import com.fhq.util.JsonToBean;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/service")
public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "登录页面");
        return "login";
    }

    @PostMapping("/index.html")
    @ResponseBody
    public Login loginUser(HttpServletRequest request, HttpServletResponse response) {
        String params = request.getParameter("params");
        Login user = loginService.login(params);
        return user;
    }

    /**
     * logout
     *
     * @return
     */
//    @RequiresAuthentication
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    /**
     * update user selective by id key
     *
     * @param request  request includes the following parameter:
     *                 user:{
     *                 "idKey":"idKey",
     *                 "account":"account",
     *                 "jobFlag":"jobFlag",
     *                 "password":"password",
     *                 "roleId":"roleId"
     *                 }
     * @param response
     * @return
     */
    @RequiresAuthentication
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public String updateUser(HttpServletRequest request, HttpServletResponse response) {
        String tmp = request.getParameter("user");
        JSONObject updateResult = new JSONObject();
        if (null == tmp) {
            log.error("## error in updateUser in [DemoController] : Null input parameter!");
            updateResult.put("errcode", "-1");
            updateResult.put("errmsg", Constants.UPDATE_NULL_PARAM_ERR.getName());
            return updateResult.toJSONString();
        }
        JSONObject tmpJson = JSONObject.parseObject(tmp);
        Login login = new Login();
        login = JsonToBean.toBean(tmpJson, login);
        Integer update = loginService.updateUserSelective(login);
        if (update == null || update <= 0) {
            log.error("## error in updateUser in [DemoController] : Update target not found!");
            updateResult.put("errcode", "-1");
            updateResult.put("errmsg", Constants.UPDATE_TARGET_NOT_FOUND_ERR.getName());
            return updateResult.toJSONString();
        }
        updateResult.put("errcode", "0");
        updateResult.put("errmsg", Constants.UPDATE_SUCCESS.getName());
        return updateResult.toJSONString();
    }

    /**
     * remove user by id key
     *
     * @param request  request includes the following parameter:
     *                 idKeys:[
     *                 {
     *                 "idKey":"idKey",
     *                 ...
     *                 }
     *                 ]
     * @param response
     * @return
     */
    @RequiresAuthentication
    @RequestMapping(value = "/removeUser", method = RequestMethod.POST)
    @ResponseBody
    public String removeUser(HttpServletRequest request, HttpServletResponse response) {
        String idKeys = request.getParameter("idKeys");
        String removeResults = loginService.removeUsers(idKeys);
        JSONArray array = JSONArray.parseArray(removeResults);
        JSONArray outArr = new JSONArray();
        for (int i = 0; i < array.size(); i++) {
            JSONObject tmpJson = new JSONObject();
            tmpJson.put("errcode", array.getJSONObject(i).getString("removeResult"));
            tmpJson.put("errmsg", array.getJSONObject(i).getString("idKey"));
            outArr.add(tmpJson);
        }
        return outArr.toJSONString();
    }

    /**
     * @param request  request 包含下列参数:
     *                 condition:{
     *                 "idKey":"idKey",
     *                 "account":"account",
     *                 "password":"password",
     *                 "roleId":"roleId",
     *                 "lastTime":"lastTime"
     *                 }
     * @param response
     * @return
     */
    @RequiresAuthentication
    @RequestMapping(value = "/getUsers", method = RequestMethod.POST)
    @ResponseBody
    public String getUsers(HttpServletRequest request, HttpServletResponse response) {
        String condition = request.getParameter("condition");
        JSONObject obj = JSONObject.parseObject(condition);
        Login tmp = new Login();
        tmp = JsonToBean.toBean(obj, tmp);
        List<Login> users = null;
        return users.toString();
    }
}
