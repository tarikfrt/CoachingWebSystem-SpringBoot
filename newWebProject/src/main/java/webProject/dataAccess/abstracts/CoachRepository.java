package webProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import webProject.entities.concretes.Coach;

public interface CoachRepository extends JpaRepository<Coach, Integer>{
	
	Coach getByCoachName(String coachName);
	Coach getByCoachId(int coachId);

}
