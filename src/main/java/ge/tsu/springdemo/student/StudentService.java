package ge.tsu.springdemo.student;

public interface StudentService {
    void addStudent(Student student);
    Student getStudent(String name);
    void deleteStudent(String name);
}
