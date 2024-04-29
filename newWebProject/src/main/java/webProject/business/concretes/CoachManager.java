package webProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import webProject.business.abstracts.CoachService;
import webProject.core.utilities.results.DataResult;
import webProject.core.utilities.results.Result;
import webProject.core.utilities.results.SuccessDataResult;
import webProject.core.utilities.results.SuccessResult;
import webProject.dataAccess.abstracts.CoachMessageRepository;
import webProject.dataAccess.abstracts.CoachRepository;
import webProject.entities.concretes.Coach;
import webProject.entities.concretes.CoachMessage;
import webProject.entities.concretes.StudentMessage;


@Service
@AllArgsConstructor
public class CoachManager implements CoachService{
	
	private CoachRepository coachRepository;
	private CoachMessageRepository coachMessageRepository;

	@Override
	public List<Coach> getAll() {
		
		List<Coach> coaches = coachRepository.findAll();
		return coaches;
	}

	@Override
	public DataResult<Coach> getByCoachName(String coachName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Coach>
		(this.coachRepository.getByCoachName(coachName),"Data listelendi");
	}

	@Override
	public Result add(Coach coach) {
		this.coachRepository.save(coach);
		return new SuccessResult("Eğitmen eklendi");
	}
	
	@Override
	public void update(Coach coach) {
		this.coachRepository.save(coach);
		
	}

	@Override
	public void delete(int coachId) {
		this.coachRepository.deleteById(coachId);
		
	}

	@Override
	public DataResult<Coach> getByCoachId(int coachId) {
		
		return new SuccessDataResult<Coach>
		(this.coachRepository.getByCoachId(coachId),"Data listelendi");
	}
	
	@Override
	public List<CoachMessage> getAllCoachMessage() {
		List<CoachMessage> coachMessages = coachMessageRepository.findAll();
		return coachMessages;
	}

	@Override
	public Result addCoachMessage(CoachMessage coachMessage) {
		this.coachMessageRepository.save(coachMessage);
		return new SuccessResult("mesaj eklendi");
	}
	
	

}
