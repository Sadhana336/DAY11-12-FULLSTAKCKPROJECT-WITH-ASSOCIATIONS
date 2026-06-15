package com.example.FullStackProject;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="courses")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //autogenerates id alue
    @Column(name="course_id")
    private Long id;
    @Column(name="course_name",nullable=false)
    private String name;
    @ManyToOne
    @JoinColumn(name="student_id",referencedColumnName = "student_id")
    private Student student;
}
