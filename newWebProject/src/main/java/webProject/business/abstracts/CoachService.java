package webProject.business.abstracts;

import java.util.List;

import webProject.core.utilities.results.DataResult;
import webProject.core.utilities.results.Result;
import webProject.entities.concretes.Coach;
import webProject.entities.concretes.CoachMessage;
import webProject.entities.concretes.StudentMessage;

public interface CoachService {
	
	List<Coach> getAll();
	
	Result add(Coach coach);
	
	List<CoachMessage> getAllCoachMessage();
	Result addCoachMessage(CoachMessage coachMessage);
	
	DataResult<Coach> getByCoachName(String coachName);
	DataResult<Coach> getByCoachId(int coachId);
	void update(Coach coach);
	void delete(int coachId);

}
