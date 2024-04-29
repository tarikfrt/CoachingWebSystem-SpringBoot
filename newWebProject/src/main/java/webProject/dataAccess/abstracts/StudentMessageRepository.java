package webProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import webProject.entities.concretes.StudentMessage;

public interface StudentMessageRepository extends JpaRepository<StudentMessage, Integer>{

}
