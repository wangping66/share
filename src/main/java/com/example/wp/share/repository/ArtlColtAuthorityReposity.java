package com.example.wp.share.repository;

import com.example.wp.share.entity.ArtlColtAuthority;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ArtlColtAuthorityReposity extends PagingAndSortingRepository<ArtlColtAuthority,String> {


    ArtlColtAuthority findByArtlTypeAndPayCondition(String artlType,String payCondition);

}
