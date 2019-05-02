package com.fhq.service;

public interface InventoryMgtService {

    /**
     * 资产入库
     * @param params
     * @return
     */
    String addInventory(String params);

    /**
     * 资产出库
     * @param params
     * @return
     */
    String decreaseInventories(String params);

    /**
     * 更新库存信息
     * @param params
     * @return
     */
    String updateInventory(String params);

    /**
     * 查看库存信息
     * @param params
     * @return
     */
    String getInventories(String params);
}
