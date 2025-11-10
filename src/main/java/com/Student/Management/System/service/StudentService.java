package com.Student.Management.System.service;

import com.Student.Management.System.entity.Student;
import java.util.*;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent (Student student);

    public Student getById(int id);

    public void deleteById(int id);
}
