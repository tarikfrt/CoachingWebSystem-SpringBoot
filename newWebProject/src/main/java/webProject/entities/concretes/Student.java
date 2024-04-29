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
@Table(name="students")
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
	private int studentId;
	
	@Column(name="name")
	private String studentName;
	
	@Column(name="surname")
	private String studentSurname;
	
	@Column(name="email")
	private String studentEmail;
	
	@Column(name="gender")
	private String studentGender;
	
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
	
	@Column(name="student_plan")
	private String studentPlan;
	
	
	
}
