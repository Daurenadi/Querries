package com.cydeo;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.logging.SocketHandler;

@Component

public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    private final CourseRepository courseRepository;

    public QueryDemo(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        System.out.println("Find by countries: " + regionRepository.findByCountry("Canada"));


        System.out.println("untied: " + regionRepository.findByCountryContainingIgnoreCase("United"));

        System.out.println(regionRepository.findByCountryContainingIgnoreCaseOrderByRegion("Untied"));
        System.out.println("top2 " + regionRepository.findTop2ByCountry("United States"));
        System.out.println("furniture: " + departmentRepository.findByDepartmentContainingIgnoreCase("Furniture"));
        System.out.println("Email: " + employeeRepository.findByEmailContainingIgnoreCase("a"));
        System.out.println("employee; " + employeeRepository.retrieveEmployeeDetails());



    }




    }

