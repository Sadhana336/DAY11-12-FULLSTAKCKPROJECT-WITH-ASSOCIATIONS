package com.example.FullStackProject;

import org.springframework.data.jpa.repository.JpaRepository;

   //data access layer

    public interface StudentRepository extends JpaRepository<Student,Long> {}

