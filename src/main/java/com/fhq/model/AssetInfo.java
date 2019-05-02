package com.fhq.model;

import java.util.Date;

public class AssetInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.id_key
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private Integer idKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_no
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private String assetNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_name
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private String assetName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_ctgy
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private String assetCtgy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_pur_dept
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private String assetPurDept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_pur_date
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private Date assetPurDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_orgn_value
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private Double assetOrgnValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.asset_duty_men
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private String assetDutyMen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.last_time
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private Date lastTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.last_opr
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private String lastOpr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column asset_info.job_flag
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    private Integer jobFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.id_key
     *
     * @return the value of asset_info.id_key
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public Integer getIdKey() {
        return idKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.id_key
     *
     * @param idKey the value for asset_info.id_key
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setIdKey(Integer idKey) {
        this.idKey = idKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_no
     *
     * @return the value of asset_info.asset_no
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public String getAssetNo() {
        return assetNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_no
     *
     * @param assetNo the value for asset_info.asset_no
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetNo(String assetNo) {
        this.assetNo = assetNo == null ? null : assetNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_name
     *
     * @return the value of asset_info.asset_name
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_name
     *
     * @param assetName the value for asset_info.asset_name
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_ctgy
     *
     * @return the value of asset_info.asset_ctgy
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public String getAssetCtgy() {
        return assetCtgy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_ctgy
     *
     * @param assetCtgy the value for asset_info.asset_ctgy
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetCtgy(String assetCtgy) {
        this.assetCtgy = assetCtgy == null ? null : assetCtgy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_pur_dept
     *
     * @return the value of asset_info.asset_pur_dept
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public String getAssetPurDept() {
        return assetPurDept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_pur_dept
     *
     * @param assetPurDept the value for asset_info.asset_pur_dept
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetPurDept(String assetPurDept) {
        this.assetPurDept = assetPurDept == null ? null : assetPurDept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_pur_date
     *
     * @return the value of asset_info.asset_pur_date
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public Date getAssetPurDate() {
        return assetPurDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_pur_date
     *
     * @param assetPurDate the value for asset_info.asset_pur_date
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetPurDate(Date assetPurDate) {
        this.assetPurDate = assetPurDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_orgn_value
     *
     * @return the value of asset_info.asset_orgn_value
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public Double getAssetOrgnValue() {
        return assetOrgnValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_orgn_value
     *
     * @param assetOrgnValue the value for asset_info.asset_orgn_value
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetOrgnValue(Double assetOrgnValue) {
        this.assetOrgnValue = assetOrgnValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.asset_duty_men
     *
     * @return the value of asset_info.asset_duty_men
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public String getAssetDutyMen() {
        return assetDutyMen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.asset_duty_men
     *
     * @param assetDutyMen the value for asset_info.asset_duty_men
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setAssetDutyMen(String assetDutyMen) {
        this.assetDutyMen = assetDutyMen == null ? null : assetDutyMen.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.last_time
     *
     * @return the value of asset_info.last_time
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.last_time
     *
     * @param lastTime the value for asset_info.last_time
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.last_opr
     *
     * @return the value of asset_info.last_opr
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public String getLastOpr() {
        return lastOpr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.last_opr
     *
     * @param lastOpr the value for asset_info.last_opr
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setLastOpr(String lastOpr) {
        this.lastOpr = lastOpr == null ? null : lastOpr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column asset_info.job_flag
     *
     * @return the value of asset_info.job_flag
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public Integer getJobFlag() {
        return jobFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column asset_info.job_flag
     *
     * @param jobFlag the value for asset_info.job_flag
     *
     * @mbg.generated Wed Jan 02 14:04:57 CST 2019
     */
    public void setJobFlag(Integer jobFlag) {
        this.jobFlag = jobFlag;
    }
}