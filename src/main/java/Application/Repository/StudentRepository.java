package Application.Repository;

import Application.Model.Student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository interface for the Student entity
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

    void save(Optional<Student> student);
}
