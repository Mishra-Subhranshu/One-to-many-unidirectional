package com.example.onetomanydemo.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="students")
public class Student {
    @Id
    private long rollno;
    @Column(name = "student_name")
    private String name;

    public Student() {
    }

    /*public Student( String name) {
        this.name = name;
    }*/

    public Long getRollno() {
        return rollno;
    }

    public void setRollno(Long rollno) {
        this.rollno= rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
