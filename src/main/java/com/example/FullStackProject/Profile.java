package com.example.FullStackProject;
import jakarta.persistence.*;
import lombok.Data;


import jakarta.persistence.Entity;

@Entity//consider as model class
@Table(name="profiles")
@Data
public class Profile {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
      @Column(name="email",nullable=false,unique=true)
    private String email;
      @Column(name="phone")
    private String phone;

}
