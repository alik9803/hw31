package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Student;
import groupId.ru.hogwarts.school.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student editStudent(Long id, Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    public Collection<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}