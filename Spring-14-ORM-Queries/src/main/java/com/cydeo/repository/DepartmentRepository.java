package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    //Display all Departments in the furniture department
    List<Department> findByDepartment(String department);

    //Display all Departments in the Health division
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //Display top 3 departments with division name includes "Hea" without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String division);

    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentDivision(List<String> division);

    List<Department> retrieveDepartmentByDivision(String division);

    @Query(nativeQuery = true)
    List<Department> retrieveDepartmentByDivisionContain(String pattern);
}
