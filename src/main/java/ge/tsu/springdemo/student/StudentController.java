package ge.tsu.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    @Qualifier("A2")
    private StudentService studentService;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/students/{name}")
    public Student getStudentByName(@PathVariable String name) {
        return studentService.getStudent(name);
    }

    @DeleteMapping("/students/{name}")
    public void deleteStudent(@PathVariable String name) {
        studentService.deleteStudent(name);
    }
}
