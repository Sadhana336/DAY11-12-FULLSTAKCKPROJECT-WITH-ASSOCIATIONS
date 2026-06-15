package com.example.FullStackProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping
    public Student create(@RequestBody Student  s){
        return service.save(s); //calls service
    }
    @GetMapping
    public List<Student> all(){
        return service.all();
    }
}
