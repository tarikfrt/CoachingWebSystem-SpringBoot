package webProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import webProject.entities.concretes.StudentDataOfPlan;

public interface StudentDataOfPlanRepository extends JpaRepository<StudentDataOfPlan, Integer>{

}
