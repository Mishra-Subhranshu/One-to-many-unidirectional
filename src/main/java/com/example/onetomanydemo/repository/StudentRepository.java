package com.example.onetomanydemo.repository;

import com.example.onetomanydemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
