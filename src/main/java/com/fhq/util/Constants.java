package com.fhq.util;

public enum Constants {
    UPDATE_NULL_PARAM_ERR("更新出错，没有检测到需要更新参数"),
    UPDATE_TARGET_NOT_FOUND_ERR("更新出错，未找到需要更新的记录"),
    UPDATE_SUCCESS("更新成功"),
    ;

    private String name;

    Constants(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
