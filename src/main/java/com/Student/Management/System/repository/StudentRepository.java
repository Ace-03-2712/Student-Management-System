package com.Student.Management.System.repository;

import com.Student.Management.System.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
