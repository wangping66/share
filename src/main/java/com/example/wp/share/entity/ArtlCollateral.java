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
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Data
@DynamicUpdate
@Table(name="ARTL_COLLATERAL")
public class ArtlCollateral implements Serializable,Cloneable{
    /** 押品ID */
    @Id
    @GeneratedValue
    private String collateralId ;


    /*@OneToOne
    @JoinColumn(name="cust_id")//维护一个关联关系
    private CustBase custBase;*/
    /** 押品名称 */
    private String collateralName ;
    /** 抵质押类型 */
    private String pledgeType ;
    /** 押品分类一级 */
    private String collateralTypeFirst ;
    /** 押品分类二级 */
    private String collateralTypeSecond ;
    /** 押品分类三级 */
    private String collateralTypeThird ;
    /** 抵质押人 */
    private String pledgeUser ;
    /** 押品属性 */
    private String collateralProperty ;
    /** 最新价值认定日期 */
    private Date evaluationDate ;
    /** 最新价值认定方式 */
    private String evaluationMethod ;
    /** 最新评估价值 */
    private BigDecimal evaluationAmt ;
    /** 价值评估状态 */
    private String evaluateStatus ;
    /** 备注 */
    private String remark ;
    /** 乐观锁 */
    private Integer revision ;
    /** 创建人 */
    private String createdBy ;
    /** 创建机构 */
    private String createdOrg ;
    /** 创建时间 */
    private Date createdTime ;
    /** 更新人 */
    private String updatedBy ;
    /** 更新机构 */
    private String updatedOrg ;
    /** 更新时间 */
    private Date updatedTime ;

}