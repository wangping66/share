package com.example.wp.share.service;

import com.example.wp.share.entity.CustBase;
import com.example.wp.share.repository.CustBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class CustBaseServiceImpl implements CustBaseService{


    @Autowired
    CustBaseRepository custBaseRepository;


    public CustBase findById(String custId) {
        CustBase custBase = custBaseRepository.findCustBaseByCustId(custId);
        return custBase;
    }
}
