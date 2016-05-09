package com.pjatk.uczelnia;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class StudentService {

    private List<Student> studentList = new ArrayList<Student>();

    public Student getStudent() {
        return new Student(new Index(1l), "John");
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getAllStudent() {
        return studentList;
    }

}
