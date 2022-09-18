package com.abhishek.restdemo.controller;

import com.abhishek.restdemo.model.Student;
import com.abhishek.restdemo.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpringControllers {

    @Autowired
    private Services services;

    @GetMapping("/getStudents")
    public List<Student> getStudents()
    {
        return services.getStudents();
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody  Student student)
    {
        return services.addStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudent(@RequestBody  List<Student> students)
    {
        return services.addStudents(students);
    }

    @DeleteMapping("/delete/{id}")
    public String removeStudent(@PathVariable int id)
    {
        return services.removeStudent(id);
    }

}
