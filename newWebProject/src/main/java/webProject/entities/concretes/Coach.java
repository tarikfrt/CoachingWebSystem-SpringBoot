package webProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="coaches")
@CrossOrigin
public class Coach {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coach_id")
	private int coachId;
	
	@Column(name="name")
	private String coachName;
	
	@Column(name="surname")
	private String coachSurname;
	
	@Column(name="email")
	private String coachEmail;
	
	@Column(name="gender")
	private String coachGender;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="password")
	private String password;
	
	@Column(name="second_password")
	private String secondPassword;
	
	@Column(name="birthday_year")
	private int birthdayYear;
	
	@Column(name="photo_url")
	private String photoUrl;
	
	@Column(name="coach_plan")
	private String coachPlan;
	
	
}
