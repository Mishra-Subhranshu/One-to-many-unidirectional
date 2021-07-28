package com.example.onetomanydemo.service;

import com.example.onetomanydemo.entity.University;
import com.example.onetomanydemo.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UniversityService {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversity() {
        List<University> universityList=new ArrayList<University>();
        universityRepository.findAll().forEach(university -> universityList.add(university));
        return universityList;
    }

    public void saveOrUpdate(University university) {
        universityRepository.save(university);
    }

    public University getById(long id) {
        return universityRepository.findById(id).get();
    }

    public void deleteUniversity(long id) {
        universityRepository.deleteById(id);
    }

}

