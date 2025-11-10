package com.Student.Management.System.serviceImpl;

import com.Student.Management.System.entity.Student;
import com.Student.Management.System.repository.StudentRepository;
import com.Student.Management.System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    private StudentRepository StudentRepository;


    @Override
    public List<Student> getAllStudents() {

        List<Student> list = StudentRepository.findAll();
        System.out.println("student from db : " + list);
        return list;
    }

    @Override
    public Student saveStudent(Student student) {

        return StudentRepository.save(student);
    }

    @Override
    public Student getById(int id) {
        return StudentRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        StudentRepository.deleteById(id);
    }
}
