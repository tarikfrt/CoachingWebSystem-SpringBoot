package webProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_plan")
public class StudentDataOfPlan {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
	private int studentId;
	
	@Column(name="plan")
	private String studentPlan;
	
	@Column(name="coach_id")
	private int coachId;
	
}