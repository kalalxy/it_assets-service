package com.fhq.service;

import com.fhq.model.AssetInfo;

import java.util.List;

public interface AssetInfoService {
    /**
     * 根据条件获取资产信息
     * @param entity
     * @return
     */
    List<AssetInfo> getAssetInfo(AssetInfo entity);

    /**
     * 插入资产信息
     * @param entity
     * @return
     */
    String addAssetInfo(AssetInfo entity);

    /**
     * 更新资产信息
     * @param entity
     * @return
     */
    String updateAssetInfo(AssetInfo entity);

    /**
     * 移除资产信息
     * @param entity
     * @return
     */
    String removeAssetInfos(AssetInfo entity);
}
