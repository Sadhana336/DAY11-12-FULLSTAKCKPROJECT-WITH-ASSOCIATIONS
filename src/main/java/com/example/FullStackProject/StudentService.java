package com.example.FullStackProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student save(Student s) {

        //  ADDed THIS BLOCK (IMPORTANT FIX)
        if (s.getCourses() != null) {//calls student class it has @data which has built in getter setter
            for (Course course : s.getCourses()) {
                course.setStudent(s);   // THIS FILLS student_id
            }
        }

        return repo.save(s);
    }

    public List<Student> all() {
        return repo.findAll();
    }
}