package com.example.wp.share.repository;

import com.example.wp.share.entity.ArtlCollateral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ArtlCollateralRepository extends JpaRepository<ArtlCollateral,String> {

    ArtlCollateral findArtlCollateralByCollateralIdAndAndCollateralName(String collateralId,String collateralName);







}
