package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

    List<Region> findByCountry(String country);
    List<Region> findByCountryContainingIgnoreCase(String country);

    List<Region> findByCountryContainingIgnoreCaseOrderByRegion(String country);
    List<Region> findTop2ByCountry(String country);


}
