package webProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import webProject.entities.concretes.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	Student getByStudentName(String studentName);
	Student getByStudentId(int studentId);
}
