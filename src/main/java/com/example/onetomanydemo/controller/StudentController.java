package com.example.onetomanydemo.controller;

import com.example.onetomanydemo.entity.Student;
import com.example.onetomanydemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> list() {
        return studentService.getAllStudent();
    }
    @PostMapping("/edit")
    public Long save(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getRollno();
    }

   /* @DeleteMapping("/delete/{rollno}")
    public String deleteStudent(@PathVariable (value = "rollno")Long rollno) {
        studentService.deleteStudent(rollno);
        return "Deleted Successfully roll = "+rollno;
    }*/
}
