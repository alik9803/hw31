package groupId.ru.hogwarts.school.service;


import groupId.ru.hogwarts.school.model.Faculty;
import groupId.ru.hogwarts.school.repository.FacultyRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {
    private final FacultyRepository facultyRepository;

    public FacultyServiceImpl(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);

    }

    public Faculty findFaculty(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }

    public Faculty editFaculty(Long id, Faculty faculty) {
        Optional<Faculty> optionalFaculty = facultyRepository.findById(id);
        if (optionalFaculty.isPresent()) {
            Faculty foundFaculty = optionalFaculty.get();
            foundFaculty.setName(faculty.getName());
            foundFaculty.setColor(faculty.getColor());
            return facultyRepository.save(foundFaculty);
        } else {
            return null;
        }
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
}