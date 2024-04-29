package webProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="coach_plan")
public class CoachDataOfPlan {
	
	@Id
    @Column(name="coach_id")
	private int coachId;
	
	@Column(name="plan")
	private String coachPlan;
}
