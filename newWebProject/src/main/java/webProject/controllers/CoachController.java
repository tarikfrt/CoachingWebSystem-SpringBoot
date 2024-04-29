package webProject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import webProject.business.abstracts.CoachService;
import webProject.core.utilities.results.DataResult;
import webProject.core.utilities.results.Result;
import webProject.entities.concretes.Coach;
import webProject.entities.concretes.CoachMessage;
import webProject.entities.concretes.StudentMessage;

@RestController
@RequestMapping("/api/coaches")
@AllArgsConstructor
@CrossOrigin
public class CoachController {
	private CoachService coachService;
	
	@GetMapping("/getAll")
	public List<Coach> getAll(){
		
		return coachService.getAll();
		
	}
	@GetMapping("/getByCoachName")
	public DataResult<Coach> getByCoachName(@RequestParam String coachName) {
		// TODO Auto-generated method stub
		return this.coachService.getByCoachName(coachName);
	}
	
	@GetMapping("/getByCoachId")
	public DataResult<Coach> getByCoachId(@RequestParam int coachId) {
		// TODO Auto-generated method stub
		return this.coachService.getByCoachId(coachId);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Coach coach) {
		return this.coachService.add(coach);
	}
	
	@PutMapping("/put")
	public void update(@RequestBody() Coach coach)
	{
		this.coachService.update(coach);
	}
	
	@DeleteMapping("/delete/{coachId}")
	public void delete(@PathVariable int coachId) {
		this.coachService.delete(coachId);
	}
	
	@PostMapping("/addMessage")
	public Result addCoachMessage(@RequestBody CoachMessage coachMessage ) {
		return this.coachService.addCoachMessage(coachMessage);
	}
	
	@GetMapping("/getAllMessage")
	public List<CoachMessage> getAllCoachMessage(){
		
		return coachService.getAllCoachMessage();
		
	}

}
