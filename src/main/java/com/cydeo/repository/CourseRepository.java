package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

   List<Course> findByCategory(String category);
   List<Course> findByCategoryOrderByName(String category);
    List<Course> findByNameStartsWith(String name);

}
