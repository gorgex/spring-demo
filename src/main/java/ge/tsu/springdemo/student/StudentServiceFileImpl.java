package ge.tsu.springdemo.student;

import org.springframework.stereotype.Service;

@Service("A2")
public class StudentServiceFileImpl implements StudentService {

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public Student getStudent(String name) {
        return null;
    }

    @Override
    public void deleteStudent(String name) {

    }
}
