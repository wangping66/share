package com.example.wp.share.service;



import com.example.wp.share.entity.ArtlColtAuthority;
import com.example.wp.share.repository.ArtlColtAuthorityReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.awt.print.Book;

@Service
public class ArtlColtAuthorityService {

    @Autowired
    ArtlColtAuthorityReposity artlColtAuthorityReposity;

    public Page<ArtlColtAuthority> findAll(Pageable page){
        return artlColtAuthorityReposity.findAll(page);
    }

}
