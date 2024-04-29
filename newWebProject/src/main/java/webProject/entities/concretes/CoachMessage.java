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
@Table(name="coaches_message")
public class CoachMessage {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="message_id")
	private int messageId;
	
    @Column(name="coach_id")
	private int coachId;
	
	@Column(name="message")
	private String coachMessage;
	
	@Column(name="sender_id")
	private int senderId;
	
	
}
