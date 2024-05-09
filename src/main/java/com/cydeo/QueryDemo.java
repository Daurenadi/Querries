package com.cydeo;

import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Find by countries: " + regionRepository.findByCountry("Canada"));


        System.out.println("untied: " + regionRepository.findByCountryContainingIgnoreCase("United"));

        System.out.println(regionRepository.findByCountryContainingIgnoreCaseOrderByRegion("Untied"));
        System.out.println("top2 " + regionRepository.findTop2ByCountry("United States"));
        System.out.println("furniture: " + departmentRepository.findByDepartmentContainingIgnoreCase("Furniture"));
    }




    }

