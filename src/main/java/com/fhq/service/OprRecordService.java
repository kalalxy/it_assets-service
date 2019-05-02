package com.fhq.service;

import com.fhq.model.OprRecord;

import java.util.List;

public interface OprRecordService {
    /**
     * 获取操作日志
     * @param record
     * @return
     */
    List<OprRecord> getRecords(OprRecord record);

    /**
     * 单个或者批量删除操作日志
     * @param record
     * @return
     */
    Integer removeRecords(OprRecord record);
}
