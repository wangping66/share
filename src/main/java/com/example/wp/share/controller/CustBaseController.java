package com.example.wp.share.controller;


import com.alibaba.fastjson.JSON;
import com.example.wp.share.entity.ArtlCollateral;
import com.example.wp.share.entity.CustBase;
import com.example.wp.share.repository.ArtlCollateralRepository;
import com.example.wp.share.repository.CustBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CustBaseController {

    @Autowired
    CustBaseRepository custBaseRepository;

    @Autowired ArtlCollateralRepository artlCollateralRepository;

    @GetMapping("/{id}")
    public String getCustNameById(@PathVariable String id) {
        CustBase custBase = custBaseRepository.findCustBaseByCustId(id);
        String jsonString = JSON.toJSONString(custBase);
        return jsonString;
    }

    @GetMapping("/")
    public String getCustBaseList() {
        List<CustBase> custBase = custBaseRepository.getCustBaseList();
        return JSON.toJSONString(custBase);
    }

    @GetMapping("testUpdate/{custNo}/{custName}")
    public Integer testUpdate(@PathVariable String custNo, @PathVariable String custName) {
        Integer number = custBaseRepository.testUpdate(custNo,custName);
        return number;
    }

    @GetMapping("testSave")
    public Integer testSave() {
        ArtlCollateral artlCollateral = new ArtlCollateral();
        CustBase custBase = new CustBase();


        artlCollateralRepository.save(artlCollateral);
        artlCollateral.setCollateralTypeFirst("9527");
        return 1;
    }


}
