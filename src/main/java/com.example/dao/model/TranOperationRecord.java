package com.example.dao.model;

import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "TRAN_OPERATION_RECORD")
public class TranOperationRecord {

    /**
     * 请求ID
     */
    @Id
    @Column(name = "REQUEST_ID")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String requestId;

    /**
     * 请求参数
     */
    @Column(name = "REQUEST_PARAM")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String requestParam;

    /**
     * OMS返回结果
     */
    @Column(name = "OMS_RESULT")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String omsResult;

    /**
     * 风控返回结果
     */
    @Column(name = "RISK_RESULT")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String riskResult;

    /**
     * 是否试算
     */
    @Column(name = "IS_TRY")
    @ColumnType(jdbcType = JdbcType.DECIMAL)
    private Integer isTry;

    /**
     * 业务类型
     */
    @Column(name = "BIZ_TYPE")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String bizType;

    /**
     * 操作类型
     */
    @Column(name = "OPER_TYPE")
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String operType;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    @ColumnType(jdbcType = JdbcType.TIMESTAMP)
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    @ColumnType(jdbcType = JdbcType.TIMESTAMP)
    private Date updateTime;


    /**
     * @return REQUEST_ID
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * @param requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return REQUEST_PARAM
     */
    public String getRequestParam() {
        return requestParam;
    }

    /**
     * @param requestParam
     */
    public void setRequestParam(String requestParam) {
        this.requestParam = requestParam;
    }

    /**
     * @return OMS_RESULT
     */
    public String getOmsResult() {
        return omsResult;
    }

    /**
     * @param omsResult
     */
    public void setOmsResult(String omsResult) {
        this.omsResult = omsResult;
    }

    /**
     * @return RISK_RESULT
     */
    public String getRiskResult() {
        return riskResult;
    }

    /**
     * @param riskResult
     */
    public void setRiskResult(String riskResult) {
        this.riskResult = riskResult;
    }

    /**
     * @return IS_TRY
     */
    public Integer getIsTry() {
        return isTry;
    }

    /**
     * @param isTry
     */
    public void setIsTry(Integer isTry) {
        this.isTry = isTry;
    }

    /**
     * @return BIZ_TYPE
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * @param bizType
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * @return OPER_TYPE
     */
    public String getOperType() {
        return operType;
    }

    /**
     * @param operType
     */
    public void setOperType(String operType) {
        this.operType = operType;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}