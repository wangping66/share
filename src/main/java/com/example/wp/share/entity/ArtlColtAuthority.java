package com.example.wp.share.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name="ARTL_COLT_AUTHORITY")
public class ArtlColtAuthority implements Serializable,Cloneable {

    /** 权证ID */
    @Id
    @GeneratedValue
    private String authorityId ;
    /** 物件类型 */
    private String artlType ;
    /** 物件ID */
    private String artlId ;
    /** 权证名称 */
    private String authorityName ;
    /** 权证号码 */
    private String authorityNo ;
    /** 发证单位 */
    private String issueOrg ;
    /** 发证日 */
    private Date issueDate ;
    /** 到期日 */
    private Date expireDate ;
    /** 权证价值 */
    private BigDecimal authorityAmt ;
    /** 是否需要入库 */
    private String needHold ;
    /** 出入库状态 */
    private String storageStatus ;
    /** 是否付款前提条件 */
    private String payCondition ;
    /**  */
    private String status ;
    /** 备注 */
    private String remar ;
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
