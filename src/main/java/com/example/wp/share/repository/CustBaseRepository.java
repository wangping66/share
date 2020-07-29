package com.example.wp.share.repository;



import com.example.wp.share.entity.CustBase;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Repository是个标记接口，自定义接口继承该接口，会被ioc容器识别为一个bean
 * 他应该不是lazy,也不是protype
 * 快捷键:ctrl+H 查看接口的继承关系
 */
public interface CustBaseRepository extends Repository<CustBase,String> {


    CustBase findCustBaseByCustId(String custId);

    @Query("from CustBase")
    List<CustBase> getCustBaseList();

    @Query(value="from CustBase where custName =?1 ")
    List<CustBase> queryCustBaseByName(String custName);



    //此类型查询，返回值只能是void/int/Integer
    @Query(value = "UPDATE cust_base set cust_no =:custNo where cust_name=:custName ", nativeQuery = true)
    @Modifying

    Integer testUpdate(String custNo,String custName);





}
