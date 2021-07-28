package com.example.onetomanydemo.repository;

import com.example.onetomanydemo.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University,Long> {

}
