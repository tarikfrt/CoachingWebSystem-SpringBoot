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
@Table(name="students_message")
public class StudentMessage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="message_id")
	private int messageId;
	
    @Column(name="student_id")
	private int studentId;
	
	@Column(name="message")
	private String studentMessage;
	
	@Column(name="sender_id")
	private int senderId;
	
	
}
