package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByEmailContainingIgnoreCase(String pattern);
    List<Employee> findByFirstNameIsNot(String patter);
    List<Employee> findTop3BySalaryLessThan(Integer salary);
    List<Employee> findByEmailIsNull();

   @Query("SELECT e FROM Employee e where e.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetails();

   @Query("SELECT employee FROM Employee employee WHERE employee.salary<>?1")
   List<Employee> retrieveEmployeeSalaryNotEqual(Integer salary);

   @Query("SELECT e FROM Employee e where e.firstName like ?1")
   List<Employee> retrieveEmployeeFirstNameLike(String pattern);





}
