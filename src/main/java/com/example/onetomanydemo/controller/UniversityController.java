package com.example.onetomanydemo.controller;

import com.example.onetomanydemo.entity.University;
import com.example.onetomanydemo.repository.UniversityRepository;
import com.example.onetomanydemo.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @PostMapping("/post")
    public Long save(@RequestBody University university) {
        universityService.saveOrUpdate(university);
        return university.getUniv_id();
    }


    @GetMapping("/get")
    public List<University> list() {
        return universityService.getAllUniversity();
    }

    @GetMapping("/get/{id}")
    public University getById(@PathVariable long id) {
        return universityService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUniversity(@PathVariable (value = "id") long id) {
        universityService.deleteUniversity(id);
        return "Deleted Successfully id = "+id;
    }

}
