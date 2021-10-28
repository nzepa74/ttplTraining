package com.training.training.controller;

import com.training.training.modal.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By zepaG on 10/26/2021.
 */
@RestController
public class HelloWorldController {
    // GET HTTP Method
    // http://localhost:8080/hello-world
    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "Fadatare"));
        students.add(new Student("Tony", "Cena"));
        students.add(new Student("Sanjay", "Jadhav"));
        students.add(new Student("Ram", "Jadhav"));
        students.add(new Student("Umesh", "Fadatare"));
        return students;
    }

    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}
