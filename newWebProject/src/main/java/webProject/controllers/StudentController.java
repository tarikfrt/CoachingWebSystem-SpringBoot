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
import webProject.business.abstracts.StudentService;
import webProject.core.utilities.results.DataResult;
import webProject.core.utilities.results.Result;
import webProject.entities.concretes.Student;
import webProject.entities.concretes.StudentDataOfPlan;
import webProject.entities.concretes.StudentMessage;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
@CrossOrigin
public class StudentController {
	private StudentService studentService;

	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		
		return studentService.getAll();
		
	}
	@GetMapping("/getByStudentName")
	public DataResult<Student> getByStudentName(@RequestParam String studentName) {
		// TODO Auto-generated method stub
		return this.studentService.getByStudentName(studentName);
	}
	
	@GetMapping("/getByStudentId")
	public DataResult<Student> getByStudentId(@RequestParam int studentId) {
		// TODO Auto-generated method stub
		return this.studentService.getByStudentId(studentId);
	}
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Student student) {
		return this.studentService.add(student);
	}
	
	@PutMapping("/put")
	public void update(@RequestBody() Student student)
	{
		this.studentService.update(student);
	}
	
	@DeleteMapping("/delete/{studentId}")
	public void delete(@PathVariable int studentId) {
		this.studentService.delete(studentId);
	}
	
	@PostMapping("/addMessage")
	public Result addStudentMessage(@RequestBody StudentMessage studentMessage ) {
		return this.studentService.addStudentMessage(studentMessage);
	}
	
	@GetMapping("/getAllMessage")
	public List<StudentMessage> getAllStudentMessage(){
		
		return studentService.getAllStudentMessage();
		
	}
	
	@PostMapping("/addStudentDataOfPlan")
	public Result addStudentDataOfPlan(@RequestBody StudentDataOfPlan studentDataOfPlan ) {
		return this.studentService.addStudentDataOfPlan(studentDataOfPlan);
	}
	
	@GetMapping("/getAllStudentDataOfPlan")
	public List<StudentDataOfPlan> getAllStudentDataOfPlan(){
		
		return studentService.getAllStudentDataOfPlan();
		
	}
	
	
	
	

}
