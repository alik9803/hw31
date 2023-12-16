package groupId.ru.hogwarts.school.service;

import groupId.ru.hogwarts.school.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty editFaculty(Long id, Faculty faculty);

    void deleteFaculty(Long id);
}