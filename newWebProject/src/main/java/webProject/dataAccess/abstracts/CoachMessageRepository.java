package webProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import webProject.entities.concretes.CoachMessage;

public interface CoachMessageRepository extends JpaRepository<CoachMessage, Integer>{

}
