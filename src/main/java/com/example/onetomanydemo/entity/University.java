package com.example.onetomanydemo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="universities")
public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long univ_id;
    @Column(name = "univ_name")
    private String  univ_name;
    @Column(name = "established_on")
    private String date;

    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //@JoinColumn(name ="university_students",referencedColumnName = "id")
    private List<Student> students;


    public University() {
    }

    /*public University(String name, String date, List<Student> students) {
        this.name = name;
        this.date = date;
        this.students = students;
    }*/

    public long getUniv_id() {
        return univ_id;
    }

    public void setUniv_id(long univ_id) {
        this.univ_id = univ_id;
    }

    public String getUniv_name() {
        return univ_name;
    }

    public void setUniv_name(String univ_name) {
        this.univ_name = univ_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
