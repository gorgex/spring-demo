package ge.tsu.springdemo.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("A1")
@Primary
public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student getStudent(String name) {
        return new Student(name);
    }

    @Override
    public void deleteStudent(String name) {

    }
}
