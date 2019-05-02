package com.fhq.util;

import com.alibaba.fastjson.JSONObject;
import com.fhq.model.Login;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonToBean {
    public static <T extends Object> T toBean(JSONObject obj, T t) {
        Field[] fields = t.getClass().getDeclaredFields();
        try {
            if (fields.length > 0) {
                for (Field field : fields) {
                    /**
                     * 如果该属性在obj中存在，则进行转换
                     */
                    if (obj.get(field.getName()) != null) {
                        // 将JavaBean属性的Accessible设为True,避免Private属性无法读取
                        field.setAccessible(true);
                        // 对相应属性进行赋值
                        if (field.getType() == java.util.Date.class) {
                            if (obj.get(field.getName()) != null &&
                                    obj.get(field.getName()).getClass().getTypeName()==java.sql.Timestamp.class.getTypeName()) {
                                field.set(t, new Date(Long.parseLong(obj.get(field.getName()).toString())));
                            }else{
                                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                field.set(t,sdf.parse(obj.get(field.getName()).toString()));
                            }
                        } else if (field.getType() == java.lang.Byte.class) {
                            field.set(t, Byte.parseByte(obj.get(field.getName()).toString()));
                        } else if (field.getType() == java.lang.Integer.class) {
                            field.set(t, Integer.valueOf(obj.get(field.getName()).toString()));
                        } else {
                            field.set(t, obj.get(field.getName()));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 此函数用于测试
     * @param args
     */
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("account", "test");
        obj.put("password", "123456");
        obj.put("idKey", 1);
        obj.put("lastTime", "2018-11-1 11:00:00");
        Login login = new Login();
        login = toBean(obj, login);
        System.err.append("***************************");
        System.out.println(login.getAccount());
        System.out.println(login.getPassword());
        System.out.println(login.getLastTime());
        System.out.println(login.getIdKey().toString());
    }
}
