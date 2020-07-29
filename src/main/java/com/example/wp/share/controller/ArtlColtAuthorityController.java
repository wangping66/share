package com.example.wp.share.controller;


import com.alibaba.fastjson.JSON;
import com.example.wp.share.entity.ArtlCollateral;
import com.example.wp.share.entity.ArtlColtAuthority;
import com.example.wp.share.entity.CustBase;
import com.example.wp.share.repository.ArtlCollateralRepository;
import com.example.wp.share.repository.ArtlColtAuthorityReposity;
import com.example.wp.share.service.ArtlColtAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.relational.core.sql.In;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ArtlColtAuthorityController {


    @Autowired
    ArtlColtAuthorityService artlColtAuthorityService;
    @Autowired
    ArtlCollateralRepository artlCollateralRepository;



    @GetMapping("/{pageSize}/{pageNum}")
    public Object getCustNameById(@PathVariable Integer pageSize,@PathVariable Integer pageNum) {
        Sort sort = Sort.by(Sort.Direction.DESC, "authorityId");
        Pageable page= PageRequest.of(pageNum, pageSize,sort);
        Page<ArtlColtAuthority> data = artlColtAuthorityService.findAll(page);
        return data;
    }



    @GetMapping("testfFindOne/{id}")
    public ArtlCollateral testfFindOne(@PathVariable String id) {
        Optional<ArtlCollateral> byId = artlCollateralRepository.findById(id);
        System.out.println(byId.get());
        return byId.get();
    }
}
