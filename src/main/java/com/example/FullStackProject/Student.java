package com.example.FullStackProject;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity//consider as model class
@Table(name="students")//custom table name

@Data // Generates getters, setters, toString, equals, and hashCode methods
//    public List<Course> getCourses() { return courses; }
//
//    public void setCourses(List<Course> courses) { this.courses = courses; }
public class Student {
    @Column(name="student_id")//to custom column name
    @Id// Marks the field as the primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)//autogenerates


    private Long id;
    @Column(name="student_name",nullable=false,length=100)//to custome column name
    private String name;
    private String department;
    @OneToOne(cascade=CascadeType.ALL)
// Whatever operation is done on Student,
// the same operation is also done on StudentProfile.
    @JoinColumn(name="profile_id",referencedColumnName="id")//profile_id is the primary key and id from another table linked as fk
//     for foreign key
//    profile_id-> student table(foreign key),id->in profile table(primary key)
//     Creates foreign key column "profile_id" in current table.
// "profile_id" refers to "id" column of the referenced table.
//    profiles
//--------
//    id = 1
//
//    students
//--------
//    student_id = 101
//    profile_id = 1
    private Profile profile;
    @OneToMany(mappedBy = "student",cascade= CascadeType.ALL)
    private List<Course> courses;

}
