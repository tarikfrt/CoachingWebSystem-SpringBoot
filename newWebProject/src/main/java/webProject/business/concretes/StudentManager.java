package webProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import webProject.business.abstracts.StudentService;
import webProject.core.utilities.results.DataResult;
import webProject.core.utilities.results.Result;
import webProject.core.utilities.results.SuccessDataResult;
import webProject.core.utilities.results.SuccessResult;
import webProject.dataAccess.abstracts.StudentDataOfPlanRepository;
import webProject.dataAccess.abstracts.StudentMessageRepository;
import webProject.dataAccess.abstracts.StudentRepository;
import webProject.entities.concretes.Student;
import webProject.entities.concretes.StudentDataOfPlan;
import webProject.entities.concretes.StudentMessage;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService{
	
	private StudentRepository studentRepository;
	private StudentMessageRepository studentMessageRepository;
	private StudentDataOfPlanRepository studentDataOfPlanRepository;

	@Override
	public List<Student> getAll() {
		
		List<Student> students = studentRepository.findAll();
		return students;
	}

	@Override
	public DataResult<Student> getByStudentName(String studentName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Student>
		(this.studentRepository.getByStudentName(studentName),"Data listelendi");
	}

	@Override
	public Result add(Student student) {
		this.studentRepository.save(student);
		return new SuccessResult("Öğrenci eklendi");
	}

	@Override
	public DataResult<Student> getByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Student>
		(this.studentRepository.getByStudentId(studentId),"Data listelendi");
		
	}

	@Override
	public void update(Student student) {
		this.studentRepository.save(student);
		
	}

	@Override
	public void delete(int studentId) {
		this.studentRepository.deleteById(studentId);
		
	}

	@Override
	public List<StudentMessage> getAllStudentMessage() {
		List<StudentMessage> studentMessages = studentMessageRepository.findAll();
		return studentMessages;
	}

	@Override
	public Result addStudentMessage(StudentMessage studentMessage) {
		this.studentMessageRepository.save(studentMessage);
		return new SuccessResult("Öğrenci eklendi");
	}

	@Override
	public List<StudentDataOfPlan> getAllStudentDataOfPlan() {
		List<StudentDataOfPlan> studentDataOfPlans = studentDataOfPlanRepository.findAll();
		return studentDataOfPlans;
	}

	@Override
	public Result addStudentDataOfPlan(StudentDataOfPlan studentDataOfPlan) {
		this.studentDataOfPlanRepository.save(studentDataOfPlan);
		return new SuccessResult("Plan eklendi");
	}

	
	
	

}
