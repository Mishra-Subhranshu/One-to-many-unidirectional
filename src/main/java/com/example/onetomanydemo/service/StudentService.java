package com.example.onetomanydemo.service;

import com.example.onetomanydemo.entity.Student;
import com.example.onetomanydemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent(){

        List<Student> studentList=new ArrayList<Student>();
        studentRepository.findAll().forEach(student -> studentList.add(student));
        return studentList;
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    //public void deleteStudent(Long rollno) {
        //studentRepository.deleteById(rollno);
   // }
}
