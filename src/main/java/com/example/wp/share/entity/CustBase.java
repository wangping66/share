package com.example.wp.share.entity;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@DynamicUpdate
@Table(name = "CUST_BASE")
public class CustBase implements Serializable, Cloneable {
    /**
     * 客户主键
     */
    @Id
    @GeneratedValue
    private String custId;


    /*@OneToOne(mappedBy = "custBase")
    private ArtlCollateral artlCollateral;*/
    /**
     * 客户编号
     */
    private String custNo;
    /**
     * 客户名称
     */
    private String custName;
    /**
     * 客户类型
     */
    private String custType;
    /**
     * 证件国别
     */
    private String certCountry;
    /**
     * 证件类型
     */
    private String certType;
    /**
     * 证件号
     */
    private String certId;
    /**
     * 来源渠道
     */
    private String channel;
    /**
     * 客户标签
     */
    private String operationType;
    /**
     * 转态
     */
    private String status;
    /**
     * 乐观锁
     */
    private Integer revision;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 创建机构
     */
    private String createdOrg;
    /**
     * 更新机构
     */
    private String updatedOrg;
    /**
     * 曾用名
     */
    private String usedName;
    /**
     * 资产状态;字典项：正常NORMAL,出险DANGER
     */
    private String assetStatus;
    /**
     * 是否关联方
     */
    private String ifRelated;
}


